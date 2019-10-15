package com.hcl.security.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
	
	private Integer userId;
	private String userName;
	private String email;
	private String phone;
	private String city;
	private String password;
	private String confirmPassword;
	private String userRole;

}
