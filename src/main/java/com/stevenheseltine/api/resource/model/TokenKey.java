package com.stevenheseltine.api.resource.model;

public class TokenKey {
    private String alg;
    private String value;

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
