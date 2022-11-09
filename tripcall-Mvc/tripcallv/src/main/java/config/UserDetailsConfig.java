package config;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.api.tripcallv.model.UserModel;
import com.api.tripcallv.repository.UserRepository;

@Service
@Transactional
public class UserDetailsConfig implements UserDetailsService {
      
	private UserRepository userRepository;
	
	public UserDetailsConfig(UserRepository userRepository ) {
		this.userRepository = userRepository;
	}
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel userModel = userRepository.findByUsername(username)
				.orElseThrow(()-> new UsernameNotFoundException("User not found with username " + username));
		return new User(userModel.getUsername(), userModel.getPassword(), true,true,true,true,userModel.getAuthorities());
	}

}
