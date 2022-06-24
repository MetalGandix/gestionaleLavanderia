package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Abiti;
public interface AbitiRepository extends JpaRepository<Abiti, Integer> {
    Abiti findByAbitiUtente(DAOUser user);
}