package com.phaete.backend.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "supabase")
public class SupabaseProperties {

    private String projectId;
    private String url;
    private String anonKey;
    private String jwtSecret;
    private String successfulLoginRedirectPage;
    private String passwordRecoveryPage;
    private String unauthenticatedPage;
    private String unauthorizedPage;
    private boolean isSslOnly;

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getAnonKey() {
        return anonKey;
    }
    public void setAnonKey(String anonKey) {
        this.anonKey = anonKey;
    }
    public String getJwtSecret() {
        return jwtSecret;
    }
    public void setJwtSecret(String jwtSecret) {
        this.jwtSecret = jwtSecret;
    }
    public String getSuccessfulLoginRedirectPage() {
        return successfulLoginRedirectPage;
    }
    public void setSuccesfulLoginRedirectPage(String successfulLoginRedirectPage) {
        this.successfulLoginRedirectPage = successfulLoginRedirectPage;
    }
    public String getPasswordRecoveryPage() {
        return passwordRecoveryPage;
    }
    public void setPasswordRecoveryPage(String passwordRecoveryPage) {
        this.passwordRecoveryPage = passwordRecoveryPage;
    }
    public String getUnauthenticatedPage() {
        return unauthenticatedPage;
    }
    public void setUnauthenticatedPage(String unauthenticatedPage) {
        this.unauthenticatedPage = unauthenticatedPage;
    }
    public String getUnauthorizedPage() {
        return unauthorizedPage;
    }
    public void setUnauthorizedPage(String unauthorizedPage) {
        this.unauthorizedPage = unauthorizedPage;
    }
    public boolean isSslOnly() {
        return isSslOnly;
    }
    public void setSslOnly(boolean isSslOnly) {
        this.isSslOnly = isSslOnly;
    }

    
}
