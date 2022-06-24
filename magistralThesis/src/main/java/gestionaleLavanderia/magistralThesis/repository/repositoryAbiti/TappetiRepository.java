package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Tappeti;

public interface TappetiRepository extends JpaRepository<Tappeti, Integer>{
    Tappeti findByTappetoUtente(DAOUser user);
}
