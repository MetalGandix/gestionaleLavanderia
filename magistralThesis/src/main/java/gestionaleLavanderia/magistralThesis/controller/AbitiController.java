package gestionaleLavanderia.magistralThesis.controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Articolo;
import gestionaleLavanderia.magistralThesis.model.Capi.ComplexCapiObject;
import gestionaleLavanderia.magistralThesis.repository.UserDaoRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.ArticoloRepository;

@RestController
@CrossOrigin
public class AbitiController {
    
    @Autowired
    private UserDaoRepository userRepo;

    @Autowired
    private ArticoloRepository articoloRepo;

    @PostMapping("/insertDress")
    public String insertDressForUser(@RequestBody ComplexCapiObject capiObject) throws ParseException{

        if(capiObject.getArticolo() != null){
            articoloRepo.save(capiObject.getArticolo());
        }
        if(capiObject.getDate() != null){
            DAOUser user = userRepo.findByUsername(capiObject.getUser().getUsername());
            DateTimeFormatter inputParser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate date = LocalDate.parse(capiObject.getDate(), inputParser);
            user.setDate(date);
            userRepo.save(user);
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

}