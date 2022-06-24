package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.GiaccheEGiacconi;

public interface GiaccheEGiacconiRepository extends JpaRepository<GiaccheEGiacconi, Integer>{
    GiaccheEGiacconi findByGiaccheEGiacconiUtente(DAOUser user);
}
