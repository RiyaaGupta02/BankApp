package com.example.BankAppdemo.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.BankAppdemo.DTO.RegistrationDTO;

@Component
public class RegistrationValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
        return RegistrationDTO.class.isAssignableFrom(clazz);
    }

	@Override
	public void validate(Object target, Errors errors) {
		RegistrationDTO registrationDTO = (RegistrationDTO) target;
		
		//Validate username
		 if (registrationDTO.getUsername() == null || registrationDTO.getUsername().isEmpty()) {
	            errors.rejectValue("username", "NotEmpty.registrationDTO.username");
	        }	
		 if (registrationDTO.getPassword() != null && registrationDTO.getPassword().length() < 10) {
	            errors.rejectValue("password", "Size.registrationDTO.password");
	        }
	}
	

}
