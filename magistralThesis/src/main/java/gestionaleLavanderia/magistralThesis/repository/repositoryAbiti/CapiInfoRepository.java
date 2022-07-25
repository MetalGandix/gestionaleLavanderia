package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;

import org.springframework.data.jpa.repository.JpaRepository;
import gestionaleLavanderia.magistralThesis.model.Capi.CapiInfo;

public interface CapiInfoRepository extends JpaRepository<CapiInfo, Integer>{
    CapiInfo findById(long id);
}