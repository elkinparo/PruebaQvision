package com.petstore.octoperf.utils;

import com.github.javafaker.Faker;
import com.petstore.octoperf.models.RegisterUser;
import com.petstore.octoperf.models.Shopingpets;



public class Generate
{
    private static final Faker FAKER = new Faker();

    public static Shopingpets information()
    {
        return new Shopingpets(FAKER.name().fullName(),FAKER.bothify("########"));
    }

    public static RegisterUser dates()
    {
        return new RegisterUser(FAKER.name().name(),
                FAKER.internet().password(),
                FAKER.name().firstName(),
                FAKER.name().lastName(),
                FAKER.internet().emailAddress(),
                FAKER.bothify("##########"),
                FAKER.address().fullAddress(),
                FAKER.address().secondaryAddress(),
                FAKER.country().name(),
                FAKER.country().capital(),
                FAKER.address().zipCode(),
                FAKER.country().capital()
        );
    }

}
