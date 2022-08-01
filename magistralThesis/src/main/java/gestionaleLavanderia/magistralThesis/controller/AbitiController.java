package gestionaleLavanderia.magistralThesis.controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
            DAOUser user = userRepo.findByUsername(capiObject.getUser().getUsername());
            DateTimeFormatter inputParser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate date = LocalDate.parse(capiObject.getDate(), inputParser);
            capiObject.getArticolo().setDate(date);
            capiObject.getArticolo().setArticoliUtente(user);
            capiObject.getArticolo().setPrezzo(0.00);
            capiObject.getArticolo().setPronto(false);
            capiObject.getArticolo().setConsegnato(false);
            capiObject.getArticolo().setNote("");
            capiObject.getArticolo().setServizio("Standard");
            capiObject.getArticolo().setNumeroLavorazione(capiObject.getnLavorazione());
            articoloRepo.save(capiObject.getArticolo());
            return "Capi inseriti";
        }else{
            return "Non hai selezionato articoli o messo date";
        }
    }

    @GetMapping("/getLastNLavorazione")
    public int getNLavorazione(){
        int numeroLavorazione;
        if(!articoloRepo.findAll().isEmpty()){
        Articolo articolo = articoloRepo.getLastArticolo();
        numeroLavorazione = articoloRepo.findNumeroLavorazione(articolo);
        }else{
            numeroLavorazione = 0;
        }
        return numeroLavorazione;
    }

    @GetMapping("/getAllCategories")
    public List<Categoria> getCategories(){
        List<Categoria> categoryList = categoriaRepo.findAll();
        return categoryList;
    }

    @PutMapping("/changeArticle")
    public String changeArticle(@RequestBody Articolo articolo){
        articoloRepo.save(articolo);
        return "Articolo modificato correttamente";
    }

    @GetMapping("/getSubCategoryById/{id}")
    public SottoCategoria getSubCatById(@PathVariable int id){
        SottoCategoria sottoCategoria = sottoCategoriaRepo.findById(id);
        return sottoCategoria;
    }

    @GetMapping("/getAllArticles")
    public List<Articolo> getArticles(){
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

    @GetMapping("/getAllArticoliFromUser/{username}")
    public List<Articolo> getArticolo(@PathVariable String username) {
        DAOUser user = userRepo.findByUsername(username);
        List<Articolo> articoloList = articoloRepo.findListArticoli(user);
        return articoloList;
    }

    @GetMapping("/findArticleById/{id}")
    public Articolo getArticoloById(@PathVariable long id) {
        Articolo articolo = articoloRepo.findById(id);
        return articolo;
    }

    @GetMapping("/getAllSubCat")
    public List<SottoCategoria> getAllSubCat(){
        List<SottoCategoria> subCat = sottoCategoriaRepo.findAll();
        return subCat;
    }

    @DeleteMapping("deleteArticle/{id}")
    public String deleteArticle(@PathVariable long id){
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

}