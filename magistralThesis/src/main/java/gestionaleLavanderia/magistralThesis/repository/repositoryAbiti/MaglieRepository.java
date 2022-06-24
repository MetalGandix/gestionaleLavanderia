package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Maglie;

public interface MaglieRepository extends JpaRepository<Maglie, Integer>{
    Maglie findByMagliaUtente(DAOUser user);
}
