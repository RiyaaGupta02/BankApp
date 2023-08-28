package com.example.BankAppdemo.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import com.example.BankAppdemo.DTO.RegistrationDTO;
import com.example.BankAppdemo.validation.RegistrationValidator;

public class RegistrationController {
	
	private final RegistrationValidator registrationValidator;

	// using Validator here in the Registration Controller to validate the registration data before processing it
	 public RegistrationController(RegistrationValidator registrationValidator) {
	        this.registrationValidator = registrationValidator;
	    }
	
	@GetMapping("/user/registration")
	public String showRegistrationForm( WebRequest request, Model model) {
	
	RegistrationDTO registrationDto = new RegistrationDTO();
	  model.addAttribute("user", registrationDto);
	    return "registration";
}
	@PostMapping("/user/registration")
    public String processRegistrationForm(
            @Validated RegistrationDTO registrationDTO,
            BindingResult bindingResult) {

        // Validate the registration data
        registrationValidator.validate(registrationDTO, bindingResult);

        if (bindingResult.hasErrors()) {
            // If there are validation errors, return to the registration form
            return "registration";
        }

        // Process the registration data and save it to the database

        // Redirect to a success page or login page
        return "redirect:/login";
    }
	
	// validate the email address by custom validation annotation called @ValidEmail
	
	
}
