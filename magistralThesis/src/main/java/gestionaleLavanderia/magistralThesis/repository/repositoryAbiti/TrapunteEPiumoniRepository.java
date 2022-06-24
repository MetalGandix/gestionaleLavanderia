package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.TrapunteEPiumoni;

public interface TrapunteEPiumoniRepository extends JpaRepository<TrapunteEPiumoni, Integer>{
    TrapunteEPiumoni findByTrapunteEPiumoniUtente(DAOUser user);
}
