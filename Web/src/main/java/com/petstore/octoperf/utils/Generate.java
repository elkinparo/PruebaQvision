package com.petstore.octoperf.utils;

import com.github.javafaker.Faker;
import com.petstore.octoperf.models.shopingpets;

public class Generate {
    private static final Faker FAKER = new Faker();

    public static shopingpets datashoping (){
        return new shopingpets(FAKER.name().name(),
                FAKER.bothify("########"));
    }


}
