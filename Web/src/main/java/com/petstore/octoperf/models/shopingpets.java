package com.petstore.octoperf.models;

public class shopingpets
{
    private final String NAME,PASWORD;

    public shopingpets(String NAME, String PASWORD) {
        this.NAME = NAME;
        this.PASWORD = PASWORD;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPASWORD() {
        return PASWORD;
    }
}
