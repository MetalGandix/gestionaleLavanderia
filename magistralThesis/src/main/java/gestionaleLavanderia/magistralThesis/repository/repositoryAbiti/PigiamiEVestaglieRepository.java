package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.PigiamaEVestaglie;

public interface PigiamiEVestaglieRepository extends JpaRepository<PigiamaEVestaglie, Integer>{
    PigiamaEVestaglie findByVestagliaUtente(DAOUser user);
}
