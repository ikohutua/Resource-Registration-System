package org.registrator.community.dto;

import org.registrator.community.entity.SmtpParameters;

public class SmtpParametersDTO {

    private String host;

    private String  protocol;

    private String port;

    private String username;

    private String password;

    private boolean tlsEnabled = true;

    public SmtpParametersDTO() {}
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTlsEnabled() {
        return tlsEnabled;
    }

    public void setTlsEnabled(boolean tlsEnabled) {
        this.tlsEnabled = tlsEnabled;
    }

    public static SmtpParametersDTO from(SmtpParameters smtpParameters) {
        SmtpParametersDTO result = new SmtpParametersDTO();
        result.host = smtpParameters.getHost();
        result.protocol = smtpParameters.getProtocol().toString();
        result.port = String.valueOf(smtpParameters.getPort());
        result.username = smtpParameters.getUsername();
        result.password = smtpParameters.getPassword();
        result.tlsEnabled = smtpParameters.getTlsEnabled();
        return result;
    }
}
