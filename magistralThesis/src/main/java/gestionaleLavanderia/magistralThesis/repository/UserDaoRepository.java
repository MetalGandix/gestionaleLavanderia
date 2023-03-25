package gestionaleLavanderia.magistralThesis.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

public interface UserDaoRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

	DAOUser findByEmail(String email);

	@Query("SELECT u FROM DAOUser u WHERE u.username LIKE %?1%")
	List<DAOUser> searchUser(String username);
}