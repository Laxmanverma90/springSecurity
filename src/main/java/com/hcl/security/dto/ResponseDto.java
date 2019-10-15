package com.hcl.security.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResponseDto {

	private String message;
	private String status;
}
