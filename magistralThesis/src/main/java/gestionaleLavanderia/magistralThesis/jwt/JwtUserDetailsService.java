package gestionaleLavanderia.magistralThesis.jwt;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.repository.UserDaoRepository;

//@Service 
@Service(value = "userService") //role based
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDaoRepository userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		DAOUser user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		//return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),	new ArrayList<>());
		//role based
		org.springframework.security.core.userdetails.User u = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
		return u;
	}

	public DAOUser findUserByUsername(String username){
		return userDao.findByUsername(username);
	}

	public Optional<DAOUser> findById(Long id) {
		return userDao.findById(id);
	}

	public List<DAOUser> findAllTheUser(){
		return (List<DAOUser>) userDao.findAll();
	}

	//role based
	private Set<GrantedAuthority> getAuthority(DAOUser user) { //Prende i ruoli
        Set<GrantedAuthority> authorities = new HashSet<>();
		return authorities;
	}

}