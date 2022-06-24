package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Scarpe;

public interface ScarpeRepository extends JpaRepository<Scarpe, Integer>{
    Scarpe findByScarpeUtente(DAOUser user);
}
