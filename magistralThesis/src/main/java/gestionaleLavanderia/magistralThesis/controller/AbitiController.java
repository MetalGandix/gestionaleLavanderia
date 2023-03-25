package gestionaleLavanderia.magistralThesis.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import gestionaleLavanderia.magistralThesis.model.Categoria;
import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.SottoCategoria;
import gestionaleLavanderia.magistralThesis.model.Capi.Articolo;
import gestionaleLavanderia.magistralThesis.model.Capi.ComplexCapiObject;
import gestionaleLavanderia.magistralThesis.repository.CategorieRepo;
import gestionaleLavanderia.magistralThesis.repository.SottoCategorieRepository;
import gestionaleLavanderia.magistralThesis.repository.UserDaoRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.ArticoloRepository;

@RestController
@CrossOrigin
public class AbitiController {

    @Autowired
    private UserDaoRepository userRepo;

    @Autowired
    private ArticoloRepository articoloRepo;

    @Autowired
    private CategorieRepo categoriaRepo;

    @Autowired
    private SottoCategorieRepository sottoCategoriaRepo;

    @PostMapping("/insertDress")
    public String insertDressForUser(@RequestBody ComplexCapiObject capiObject)
            throws ParseException, MessagingException {
        if (capiObject.getDate() != null && capiObject.getArticolo() != null) {
            DAOUser user = userRepo.findById(capiObject.getUser().getId()).get();
            DateTimeFormatter inputParser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate deliveryDate = LocalDate.parse(capiObject.getDate(), inputParser);
            capiObject.getArticolo().setDeliveryDate(deliveryDate);
            capiObject.getArticolo().setInizialDate(LocalDate.now());
            capiObject.getArticolo().setArticoliUtente(user);
            capiObject.getArticolo().setPrezzo(0.00);
            capiObject.getArticolo().setPronto(false);
            capiObject.getArticolo().setConsegnato(false);
            capiObject.getArticolo().setNote("");
            capiObject.getArticolo().setServizio("Standard");
            capiObject.getArticolo().setNumeroLavorazione(capiObject.getnLavorazione());
            articoloRepo.save(capiObject.getArticolo());
            return "Capi inseriti";
        } else {
            return "Non hai selezionato articoli o messo date";
        }
    }

    @PostMapping("/addAllItems")
    public String insertAllSavedItem(@RequestBody List<Articolo> articleList) {
        articoloRepo.saveAll(articleList);
        return "Items inserted!";
    }

    @GetMapping("/getLastNLavorazione")
    public int getNLavorazione() {
        int numeroLavorazione;
        if (!articoloRepo.findAll().isEmpty()) {
            Articolo articolo = articoloRepo.getLastArticolo();
            numeroLavorazione = articoloRepo.findNumeroLavorazione(articolo);
        } else {
            numeroLavorazione = 0;
        }
        return numeroLavorazione;
    }

    @GetMapping("/getAllCategories")
    public List<Categoria> getCategories() {
        List<Categoria> categoryList = categoriaRepo.findAll();
        return categoryList;
    }

    @PutMapping("/changeArticle")
    public String changeArticle(@RequestBody Articolo articolo) {
        articoloRepo.save(articolo);
        return "Articolo modificato correttamente";
    }

    @GetMapping("/getSubCategoryById/{id}")
    public SottoCategoria getSubCatById(@PathVariable int id) {
        SottoCategoria sottoCategoria = sottoCategoriaRepo.findById(id);
        return sottoCategoria;
    }

    @GetMapping("/getAllArticles")
    public List<Articolo> getArticles() {
        List<Articolo> articleList = articoloRepo.findAll();
        return articleList;
    }

    @GetMapping("/getAllCapiFromUser/{username}")
    public ComplexCapiObject getCapi(@PathVariable String username) {
        DAOUser user = userRepo.findByUsername(username);
        Articolo articolo = articoloRepo.findByArticoliUtente(user);
        ComplexCapiObject complexObject = new ComplexCapiObject();
        complexObject.setArticolo(articolo);
        return complexObject;
    }

    @GetMapping("/getAllArticoliFromUser/{id}")
    public List<Articolo> getArticolo(@PathVariable Long id) {
        DAOUser user = userRepo.findById(id).get();
        List<Articolo> articoloList = articoloRepo.findListArticoli(user);
        return articoloList;
    }

    @GetMapping("/findArticleById/{id}")
    public Articolo getArticoloById(@PathVariable long id) {
        Articolo articolo = articoloRepo.findById(id);
        return articolo;
    }

    @GetMapping("/getAllSubCat")
    public List<SottoCategoria> getAllSubCat() {
        List<SottoCategoria> subCat = sottoCategoriaRepo.findAll();
        return subCat;
    }

    @DeleteMapping("deleteArticle/{id}")
    public String deleteArticle(@PathVariable long id) {
        Articolo articolo = articoloRepo.findById(id);
        articoloRepo.delete(articolo);
        return "Articolo eliminato";
    }

    @PostMapping("/deleteArticleFromUser")
    public String changeArticolo(@RequestBody Articolo articolo)
            throws IllegalArgumentException, IllegalAccessException {
        articoloRepo.delete(articolo);
        return "Articolo cambiato correttamente";
    }

    @PostMapping("/saveAndResetArticles")
    public ResponseEntity<ByteArrayResource> saveAndResetArticles(@RequestBody List<Articolo> articles) throws StreamWriteException, DatabindException, IOException {
        try {
            // Salva la lista di articoli come file JSON
            ObjectMapper objectMapper1 = new ObjectMapper();
            ObjectMapper objectMapper2 = new ObjectMapper();
            objectMapper1.registerModule(new JavaTimeModule());
            objectMapper2.registerModule(new JavaTimeModule());
            objectMapper1.writeValue(new File(System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "articles.json"), articles);
            objectMapper2.writeValue(new File("src" + File.separator + "main" + File.separator + "resources" + File.separator + "articles.json"), articles);
            
            articoloRepo.deleteAll();
    
            // Scarica il file JSON
            byte[] jsonData = Files.readAllBytes(new File("src" + File.separator + "main" + File.separator + "resources" + File.separator + "articles.json").toPath());
            ByteArrayResource resource = new ByteArrayResource(jsonData);
    
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=articles.json")
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .contentLength(jsonData.length)
                    .body(resource);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ByteArrayResource(("Errore durante il salvataggio degli articoli: " + e.getMessage()).getBytes()));
        }
    }

}