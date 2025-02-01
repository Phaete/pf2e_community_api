package com.phaete.backend.model;

public class SignUpResponse {

    private String accessToken;

    public SignUpResponse(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
