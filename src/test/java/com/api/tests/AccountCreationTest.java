package com.api.tests;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

import java.util.UUID;

public class AccountCreationTest {
	@Test(description = "Verify if Login API is working...")

	public void createAccountTest() {
		String username = "prat" + System.currentTimeMillis();
		String email = "prat" + System.currentTimeMillis() + "@gmail.com";
		String password = "pass" + System.currentTimeMillis();

		SignUpRequest signUpRequest=new SignUpRequest.Builder()
		.userName(username)
		.email(email)
		.firstName( UUID.randomUUID().toString())
		.password(password)
		.lastName(UUID.randomUUID().toString())
		.mobileNumber("1234567890")
		.build();
		
		
		AuthService authService = new AuthService();
		Response response=authService.signUp(signUpRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		Assert.assertEquals(response.statusCode(), 200);

	}
}
