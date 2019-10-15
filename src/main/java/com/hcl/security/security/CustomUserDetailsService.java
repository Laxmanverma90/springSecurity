package com.hcl.security.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hcl.security.entity.User;
import com.hcl.security.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> optionalUser = userRepository.findByEmail(email);
		CustomUserDetails userDetail = null;
		if(optionalUser.isPresent()){
			userDetail = new CustomUserDetails();
			userDetail.setUser(optionalUser.get());
		}else{
			throw new UsernameNotFoundException("User doesnot exist with email : "+email); 
		}
		return userDetail;
	}

}
