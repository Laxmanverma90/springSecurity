package com.hcl.security.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class LoginResponseDto {

	private String message;
	private String status;
	private Integer userId;
	private String userName;
}
