package com.elife.mygasstationproject.DTO.Login;

public class LoginResponseDto {
    private String token;
    private int accountId;
    private String responseData;
    private String role;

    public LoginResponseDto(String token, int accountId, String responseData, String role) {
        this.token = token;
        this.accountId = accountId;
        this.responseData = responseData;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

