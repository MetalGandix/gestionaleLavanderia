package gestionaleLavanderia.magistralThesis.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Repository
public interface UserDaoRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

	@Query("SELECT u FROM DAOUser u WHERE u.username LIKE %?1%")
	List<DAOUser> searchUser(String username);
}