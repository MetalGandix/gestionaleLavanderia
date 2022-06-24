package gestionaleLavanderia.magistralThesis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import gestionaleLavanderia.magistralThesis.model.Roles.UserRole;


@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}