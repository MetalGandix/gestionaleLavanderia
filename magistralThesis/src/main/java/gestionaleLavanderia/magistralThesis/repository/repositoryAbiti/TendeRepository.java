package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Tende;

public interface TendeRepository extends JpaRepository<Tende, Integer>{
    Tende findByTendeUtente(DAOUser user);
}
