package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Pantaloni;

public interface PantaloniRepository extends JpaRepository<Pantaloni, Integer>{
    Pantaloni findByPantaloniUtente(DAOUser user);
}
