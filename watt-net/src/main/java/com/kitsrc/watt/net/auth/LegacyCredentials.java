package com.kitsrc.watt.net.auth;

@SuppressWarnings("deprecation")
public class LegacyCredentials implements Credentials {

    private final Credential legacyCredential;

    public LegacyCredentials(Credential legacyCrendential) {
        this.legacyCredential = legacyCrendential;
    }

    @Override
    public String getAccessKeyId() {
        return legacyCredential.getAccessKeyId();
    }

    @Override
    public String getAccessKeySecret() {
        return legacyCredential.getAccessSecret();
    }

}