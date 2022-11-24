package com.petstore.octoperf.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Loggin
{
    private Loggin(){

    }
    public static final Target SIG_IN = Target.the("SIG_IN").located(By.xpath("//*[text()='Sign In']"));
    public static final Target USER = Target.the("USER").located(By.id("stripes-1181717825"));
}
