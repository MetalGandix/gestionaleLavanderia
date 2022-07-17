package gestionaleLavanderia.magistralThesis.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gestionaleLavanderia.magistralThesis.mailSender.SmtpMailSender;
import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.repository.UserDaoRepository;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserDaoRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

    @Autowired
	private SmtpMailSender mailSender;

    @PostMapping("/registerUser")
    String addUser(@RequestBody DAOUser user) throws MessagingException{
        if(user.getPassword().length() != 0){
        user.setPassword(bcryptEncoder.encode(user.getPassword()));
        }
        /*mailSender.send(user.getEmail(), "Sei stato registrato nel portale della lavanderia. ", "Ti arriveranno delle mail che ti segnaleranno quando un tuo panno depositato è pronto.");*/
        userRepository.save(user);
        return "Utente aggiunto con successo!!";
    }

    @GetMapping("/existUser/{username}")
    public boolean existUser(@PathVariable String username) {
        if (userRepository.findByUsername(username) == null) {
            return false;
        } else {
            return true;
        }
    }

    @GetMapping("/vediUtenti")
    public List<DAOUser> vediUtenti() {
        return (List<DAOUser>) userRepository.findAll();
    }

    @GetMapping("/getSpecificUsers/{username}")
    public List<DAOUser> getUsersQuery(@Param("titolo") DAOUser user) {
        return (List<DAOUser>) userRepository.searchUser(user.getUsername());
    }
    
    @GetMapping("/vediUtenti/{username}")
    public DAOUser vediUtente(Authentication a, @PathVariable String username) {
        return (DAOUser) userRepository.findByUsername(username);
    }

    @PutMapping("/cambiaUtente/{usernameid}")
    public DAOUser cambiaUtente(Authentication a, @RequestBody DAOUser username) {
        return (DAOUser) userRepository.save(username);
    }

    @DeleteMapping("/deleteUser/{username}")
    public String deleteUser(Authentication a, @PathVariable String username){
        userRepository.delete(userRepository.findByUsername(username));        
        return "Utente eliminato ";
    }
}