package com.auth.sec.admin.dto;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@RequiredArgsConstructor
@Getter
@Setter
public class AuthRequest{
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<String> roles;
}
