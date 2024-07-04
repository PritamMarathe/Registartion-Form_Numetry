package com.RegistartionForm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @NotBlank(message = "Username is mandatory")
    @Size(min = 4, max = 15, message = "Username must be between 4 to 15 characters")
    private String username;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    @Pattern(regexp = ".*@.*", message = "Email must contain @ symbol")
    private String email;

    @Pattern(regexp = "^[789]\\d{9}$", message = "Phone number should be 10 digits and start with 7, 8, or 9")
    private String phoneno;


    @Size(min = 5, max = 15, message = "Password should be between 5 and 15 characters")
    private String password;

    @NotBlank(message = "Confirm Password is mandatory")
    private String confirmpassword;

    @NotBlank(message = "Gender is mandatory")
    private String gender;

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPasswordsMatching() {
        return this.password.equals(this.confirmpassword);
    }
}
