package gestionaleLavanderia.magistralThesis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Abiti;
import gestionaleLavanderia.magistralThesis.repository.UserDaoRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.AbitiRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.CamicieRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.CappelliRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.GiaccheEGiacconiRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.GonneRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.MaglieRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.PantaloniRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.PigiamiEVestaglieRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.ScarpeRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.TappetiRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.TendeRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.TrapunteEPiumoniRepository;
import gestionaleLavanderia.magistralThesis.repository.repositoryAbiti.VarieRepository;

@RestController
@CrossOrigin
public class AbitiController {
    
    @Autowired
    private UserDaoRepository userRepo;

    @Autowired
    private AbitiRepository abitiRepo;

    @Autowired
    private CamicieRepository camicieRepo;

    @Autowired
    private CappelliRepository cappelliRepo;

    @Autowired
    private GiaccheEGiacconiRepository giaccheEGiacconiRepo;

    @Autowired
    private GonneRepository gonneRepo;

    @Autowired
    private MaglieRepository maglieRepo;

    @Autowired
    private PantaloniRepository pantaloniRepo;

    @Autowired
    private PigiamiEVestaglieRepository pigiamiEVestaglieRepo;

    @Autowired
    private ScarpeRepository scarpeRepo;

    @Autowired
    private TappetiRepository tappetiRepo;
    
    @Autowired
    private TendeRepository tendeRepo;

    @Autowired
    private TrapunteEPiumoniRepository trapunteEPiumoniRepo;

    @Autowired
    private VarieRepository varieRepo;

    @GetMapping("/getAllCapi")
    public String getCapi(@PathVariable String username) {
        DAOUser user = userRepo.findByUsername(username);
        Abiti abitiUser = userRepo.findAbitiById(user.getId());
        return "Ecco i capi";
    }

    
}
