package org.generation.personalblog.security;

import java.util.Optional;

import org.generation.personalblog.model.UserModel;
import org.generation.personalblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplements implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<UserModel> user = userRepository.findByUsuario(userName);
		user.orElseThrow(()	-> new UsernameNotFoundException(userName + " not found"));
		
		return user.map(UserDetailsImplements::new).get();
	}

}