package com.paper.demo.auth.service.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AuthDto {

	@Getter
	@NoArgsConstructor(access = AccessLevel.PROTECTED)
	public static class LoginDto {
		private String email;
		private String password;


		@Builder
		public LoginDto(String email, String password) {
			this.email = email;
			this.password = password;
		}
	}

	@Getter
	@NoArgsConstructor(access = AccessLevel.PROTECTED)
	public static class SignupDto {
		private String email;
		private String password;
		private String name;

		@Builder
		public SignupDto(String email, String password,String name) {
			this.email = email;
			this.password = password;
			this.name = name;
		}

		public static SignupDto encodePassword(SignupDto signupDto, String encodedPassword) {
			SignupDto newSignupDto = new SignupDto();
			newSignupDto.email = signupDto.getEmail();
			newSignupDto.password = encodedPassword;
			return newSignupDto;
		}
	}

	@Getter
	@NoArgsConstructor(access = AccessLevel.PROTECTED)
	public static class TokenDto {
		private String accessToken;
		private String refreshToken;

		public TokenDto(String accessToken, String refreshToken) {
			this.accessToken = accessToken;
			this.refreshToken = refreshToken;
		}
	}
	@Getter
	@NoArgsConstructor(access = AccessLevel.PROTECTED)
	public static class EmailDto{
		private String email;

		@Builder
		public EmailDto(String email) {
			this.email = email;
		}
	}
}
