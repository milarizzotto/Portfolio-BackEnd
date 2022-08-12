package com.miPortfolio.PortfolioSB.security;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

public class AuthRequest {
    @Email
    @Length(min=3, max=45)
    private String email;
    @Length(min=3, max=45)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
