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
import gestionaleLavanderia.magistralThesis.model.Capi.Camicie;
import gestionaleLavanderia.magistralThesis.model.Capi.Cappelli;
import gestionaleLavanderia.magistralThesis.model.Capi.ComplexCapiObject;
import gestionaleLavanderia.magistralThesis.model.Capi.GiaccheEGiacconi;
import gestionaleLavanderia.magistralThesis.model.Capi.Gonne;
import gestionaleLavanderia.magistralThesis.model.Capi.Maglie;
import gestionaleLavanderia.magistralThesis.model.Capi.Pantaloni;
import gestionaleLavanderia.magistralThesis.model.Capi.PigiamaEVestaglie;
import gestionaleLavanderia.magistralThesis.model.Capi.Scarpe;
import gestionaleLavanderia.magistralThesis.model.Capi.Tappeti;
import gestionaleLavanderia.magistralThesis.model.Capi.Tende;
import gestionaleLavanderia.magistralThesis.model.Capi.TrapunteEPiumoni;
import gestionaleLavanderia.magistralThesis.model.Capi.Varie;
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

    @GetMapping("/getAllCapiFromUser/{username}")
    public ComplexCapiObject getCapi(@PathVariable String username) {
        DAOUser user = userRepo.findByUsername(username);
        long id = user.getId();
        Abiti abiti = userRepo.findAbitiById(id);
        Camicie camicie = userRepo.findCamicieById(id);
        Cappelli cappelli = userRepo.findCappelliById(id);
        GiaccheEGiacconi giaccheEGiacconi = userRepo.findGiaccheEGiacconiById(id);
        Gonne gonne = userRepo.findGonneById(id);
        Maglie maglie = userRepo.findMaglieById(id);
        Pantaloni pantaloni = userRepo.findPantaloniById(id);
        PigiamaEVestaglie pigiamiEVestaglie = userRepo.findPigiamaEVestaglieById(id);
        Scarpe scarpe = userRepo.findScarpeById(id);
        Tappeti tappeti = userRepo.findTappetiById(id);
        Tende tende = userRepo.findTendeById(id);
        TrapunteEPiumoni trapunteEPiumoni = userRepo.findTrapunteEPiumoniById(id);
        Varie varie = userRepo.findVarieById(id);
        ComplexCapiObject complexObject = new ComplexCapiObject();
        complexObject.setAbiti(abiti);
        complexObject.setCamicie(camicie);
        complexObject.setCappelli(cappelli);
        complexObject.setGiaccheEGiacconi(giaccheEGiacconi);
        complexObject.setGonne(gonne);
        complexObject.setMaglie(maglie);
        complexObject.setPantaloni(pantaloni);
        complexObject.setPigiamaEVestaglie(pigiamiEVestaglie);
        complexObject.setScarpe(scarpe);
        complexObject.setTappeti(tappeti);
        complexObject.setTende(tende);
        complexObject.setTrapunteEPiumoni(trapunteEPiumoni);
        complexObject.setVarie(varie);
        return complexObject;
    }

    
}
