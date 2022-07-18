package gestionaleLavanderia.magistralThesis.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/insertDress")
    public String insertDressForUser(@RequestBody ComplexCapiObject capiObject) throws ParseException{
        if(capiObject.getAbiti().getAbitiUtente() != null){
            abitiRepo.save(capiObject.getAbiti());
        }
        if(capiObject.getCamicie().getCamiciaUtente() != null){
            camicieRepo.save(capiObject.getCamicie());
        }
        if(capiObject.getCappelli().getCappelloUtente() != null){
            cappelliRepo.save(capiObject.getCappelli());
        }
        if(capiObject.getGiaccheEGiacconi().getGiaccheEGiacconiUtente() != null){
            giaccheEGiacconiRepo.save(capiObject.getGiaccheEGiacconi());
        }
        if(capiObject.getGonne().getGonnaUtente() != null){
            gonneRepo.save(capiObject.getGonne());
        }
        if(capiObject.getMaglie().getMagliaUtente() != null){
            maglieRepo.save(capiObject.getMaglie());
        }
        if(capiObject.getPantaloni().getPantaloniUtente() != null){
            pantaloniRepo.save(capiObject.getPantaloni());
        }
        if(capiObject.getPigiamaEVestaglie().getVestagliaUtente() != null){
            pigiamiEVestaglieRepo.save(capiObject.getPigiamaEVestaglie());
        }
        if(capiObject.getScarpe().getScarpeUtente() != null){
            scarpeRepo.save(capiObject.getScarpe());
        }
        if(capiObject.getTappeti().getTappetoUtente() != null){
            tappetiRepo.save(capiObject.getTappeti());
        }
        if(capiObject.getTende().getTendeUtente() != null){
            tendeRepo.save(capiObject.getTende());
        }
        if(capiObject.getTrapunteEPiumoni().getTrapunteEPiumoniUtente() != null){
            trapunteEPiumoniRepo.save(capiObject.getTrapunteEPiumoni());
        }
        if(capiObject.getVarie().getVarieUtente() != null){
            varieRepo.save(capiObject.getVarie());
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
        Abiti abiti = abitiRepo.findByAbitiUtente(user);
        Camicie camicie = camicieRepo.findByCamiciaUtente(user);
        Cappelli cappelli = cappelliRepo.findByCappelloUtente(user);
        GiaccheEGiacconi giaccheEGiacconi = giaccheEGiacconiRepo.findByGiaccheEGiacconiUtente(user);
        Gonne gonne = gonneRepo.findByGonnaUtente(user);
        Maglie maglie = maglieRepo.findByMagliaUtente(user);
        Pantaloni pantaloni = pantaloniRepo.findByPantaloniUtente(user);
        PigiamaEVestaglie pigiamiEVestaglie = pigiamiEVestaglieRepo.findByVestagliaUtente(user);
        Scarpe scarpe = scarpeRepo.findByScarpeUtente(user);
        Tappeti tappeti = tappetiRepo.findByTappetoUtente(user);
        Tende tende = tendeRepo.findByTendeUtente(user);
        TrapunteEPiumoni trapunteEPiumoni = trapunteEPiumoniRepo.findByTrapunteEPiumoniUtente(user);
        Varie varie = varieRepo.findByVarieUtente(user);
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