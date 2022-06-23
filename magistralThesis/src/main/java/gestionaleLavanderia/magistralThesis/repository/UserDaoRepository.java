package gestionaleLavanderia.magistralThesis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Abiti;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserDaoRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

	@Query("SELECT o FROM Abiti o where o.id = :id") 
    Abiti findAbitiById(@Param("id") long id);
}