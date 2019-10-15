package com.hcl.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.security.dto.LoginDto;
import com.hcl.security.dto.LoginResponseDto;
import com.hcl.security.dto.ResponseDto;
import com.hcl.security.dto.UserDto;
import com.hcl.security.service.UserService;

@RequestMapping("/api")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<ResponseDto> registerUser(@RequestBody UserDto userDto){
		
		return new ResponseEntity<>(userService.registerUser(userDto), HttpStatus.CREATED);
	}
	
	@PostMapping("/users/login")
	public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
//		return new ResponseEntity<T>(userService.login(loginDto), HttpStatus.OK);
		return new ResponseEntity<>("Processing", HttpStatus.OK);
	}
}
