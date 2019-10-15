package com.hcl.security.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hcl.security.dto.ResponseDto;
import com.hcl.security.dto.UserDto;
import com.hcl.security.entity.Role;
import com.hcl.security.entity.User;
import com.hcl.security.repository.UserRepository;
import com.hcl.security.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public ResponseDto registerUser(UserDto userDto) {

		if (!userDto.getPassword().equals(userDto.getConfirmPassword())) {
			System.out.println("Password mismatch.");
		} else {
			User user = new User();
			Role role = new Role();
			BeanUtils.copyProperties(userDto, user);
			role.setRoleName(userDto.getUserRole());
			Set<Role> roles = new HashSet<>();
			roles.add(role);
			user.setRoles(roles);
			user.setPassword(passwordEncoder.encode(userDto.getPassword()));
			userRepository.save(user);
		}

		return ResponseDto.builder().message("Congratulation! Registration successful..").status("success").build();
	}

}
