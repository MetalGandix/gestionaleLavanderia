package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Articolo;

public interface ArticoloRepository extends JpaRepository<Articolo, Integer>{
    Articolo findByArticoliUtente(DAOUser user);
    
}
