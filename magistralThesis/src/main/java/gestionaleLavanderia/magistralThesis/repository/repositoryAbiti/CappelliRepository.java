package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Cappelli;

public interface CappelliRepository extends JpaRepository<Cappelli, Integer>{
    Cappelli findByCappelloUtente(DAOUser user);
}