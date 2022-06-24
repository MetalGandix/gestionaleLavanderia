package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Varie;

public interface VarieRepository extends JpaRepository<Varie, Integer>{
    Varie findByVarieUtente(DAOUser user);
}