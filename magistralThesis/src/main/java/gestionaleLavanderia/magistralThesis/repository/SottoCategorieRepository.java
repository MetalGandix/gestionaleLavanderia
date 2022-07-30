package gestionaleLavanderia.magistralThesis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionaleLavanderia.magistralThesis.model.SottoCategoria;

public interface SottoCategorieRepository extends JpaRepository<SottoCategoria, Integer>{
    SottoCategoria findById(long id);
    
}
