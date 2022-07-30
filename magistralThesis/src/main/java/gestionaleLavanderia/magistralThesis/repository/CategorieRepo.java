package gestionaleLavanderia.magistralThesis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gestionaleLavanderia.magistralThesis.model.Categoria;

public interface CategorieRepo extends JpaRepository<Categoria, Integer>{
    
}
