package com.patrick.registrationwebapp.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;

    @NotEmpty(message = "Name can not be empty")
    private String name;

    @NotEmpty(message = "Email can not be empty")
    @Email
    private String email;

    private String telephone;
    
    @NotEmpty(message = "Password can not be empty")
    private String password;

    private String passwordConfirmation;

    @AssertTrue(message = "Passwords must match")
    public boolean isPasswordsEqual() {
        try {
            return password.equals(passwordConfirmation);
        } catch(NullPointerException e) {
            return false;
        }
    }
}