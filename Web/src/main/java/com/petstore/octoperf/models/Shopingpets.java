package com.petstore.octoperf.models;

public class Shopingpets
{
    private final String NAME,PASWORD;

    public Shopingpets(String NAME, String PASWORD) {
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
