package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Gonne;

public interface GonneRepository extends JpaRepository<Gonne, Integer>{
    Gonne findByGonnaUtente(DAOUser user);
}
