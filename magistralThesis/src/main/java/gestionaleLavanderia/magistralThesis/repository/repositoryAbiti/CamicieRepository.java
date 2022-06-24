package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Camicie;

public interface CamicieRepository extends JpaRepository<Camicie, Integer>{
    Camicie findByCamiciaUtente(DAOUser user);
}
