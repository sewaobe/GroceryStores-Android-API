package org.example.lab_nhom_1.dto;

public class ForgotPasswordRequest
{
    private String email;
    private String newPassword;

    // Constructors
    public ForgotPasswordRequest() {}

    public ForgotPasswordRequest(String email, String newPassword) {
        this.email = email;
        this.newPassword = newPassword;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
