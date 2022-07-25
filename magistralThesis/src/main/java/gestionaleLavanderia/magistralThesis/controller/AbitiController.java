package gestionaleLavanderia.magistralThesis.controller;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import gestionaleLavanderia.magistralThesis.mailSender.SmtpMailSender;
import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Articolo;
import gestionaleLavanderia.magistralThesis.model.Capi.ComplexCapiObject;
import gestionaleLavanderia.magistralThesis.repository.UserDaoRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.ArticoloRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.CapiInfoRepository;

@RestController
@CrossOrigin
public class AbitiController {

    @Autowired
    private UserDaoRepository userRepo;

    @Autowired
    private ArticoloRepository articoloRepo;

    @Autowired
    private SmtpMailSender mailSender;

    @Autowired
    private CapiInfoRepository capiInfoRepo;

    @PostMapping("/insertDress")
    public String insertDressForUser(@RequestBody ComplexCapiObject capiObject)
            throws ParseException, MessagingException {
        if (capiObject.getArticolo() != null) {
            articoloRepo.save(capiObject.getArticolo());
        }
        if (capiObject.getDate() != null) {
            DAOUser user = userRepo.findByUsername(capiObject.getUser().getUsername());
            DateTimeFormatter inputParser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate date = LocalDate.parse(capiObject.getDate(), inputParser);
            capiObject.getArticolo().setDate(date);
            capiObject.getArticolo().setArticoliUtente(user);
            articoloRepo.save(capiObject.getArticolo());
            userRepo.save(user);
            // mailSender.send(user.getEmail(), "Tieniti pronto a ritirare gli articoli! ",
            //         "Controlla la tua mail per sapere quando è pronto");
        }
        return "Capi inseriti";
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

    @PostMapping("/changeArticoloFromUser")
    public String changeArticolo(@RequestBody Articolo articolo)
            throws IllegalArgumentException, IllegalAccessException {
        List<Integer> list = new ArrayList<Integer>();
        Field[] fields = articolo.getClass().getDeclaredFields();
        for (Field f : fields) {
            // Iterando devo controllare che non iteri: l'id, il campo che joina l'utente e
            // il campo date.
            if (f.getName() != "id") {
                if (f.getName() != "articoliUtente") {
                    if (f.getName() != "date") {
                        int a = (int) f.get(articolo);
                        list.add(a);
                    }
                }
            }
        }
        // Conta se nella lista ci sono degli elementi a 0, se non ci sono elimina
        // l'oggetto
        if (list.stream().filter(i -> i != 0).count() == 0) {
            articoloRepo.delete(articolo);
            list.clear();
        } else {
            articoloRepo.save(articolo);
        }
        return "Articolo cambiato correttamente";
    }

}