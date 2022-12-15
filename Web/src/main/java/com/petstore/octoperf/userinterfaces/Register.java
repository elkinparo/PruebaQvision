package com.petstore.octoperf.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register
{
    private Register() {
    }
    public static final Target REGISTER_NOW = Target.the("REGISTER_NOW").located(By.xpath("//*[text()='Register Now!']"));
    public static final Target USER_ID = Target.the("USER_ID").located(By.id("stripes--2108566156"));
    public static final Target NEW_PASSWORD = Target.the("NEW_PASSWORD").located(By.xpath("//input[@name='password']"));
    public static final Target REPEAT_PASSWORD = Target.the("REPEAT_PASSWORD").located(By.xpath("//input[@name='repeatedPassword']"));
    public static final Target FIRST_NAME = Target.the("FIRST_NAME").located(By.xpath("//input[@name='account.firstName']"));
    public static final Target LAST_NAME = Target.the("LAST_NAME").located(By.xpath("//input[@name='account.lastName']"));
    public static final Target EMAIL = Target.the("EMAIL").located(By.xpath("//input[@name='account.email']"));
    public static final Target PHONE = Target.the("PHONE").located(By.xpath("//input[@name='account.phone']"));
    public static final Target ADDRESS1 = Target.the("ADDRESS1").located(By.xpath("//input[@name='account.address1']"));
    public static final Target ADDRESS2 = Target.the("ADDRESS2").located(By.xpath("//input[@name='account.address2']"));
    public static final Target CITY = Target.the("CITY").located(By.xpath("//input[@name='account.city']"));
    public static final Target STATE = Target.the("CITY").located(By.xpath("//input[@name='account.state']"));
    public static final Target ZIP = Target.the("ZIP").located(By.xpath("//input[@name='account.zip']"));
    public static final Target COUNTRY = Target.the("COUNTRY").located(By.xpath("//input[@name='account.country']"));
    public static final Target ENABLE_MY_LIST = Target.the("ENABLE_MY_LIST").located(By.xpath("//input[@name='account.listOption']"));
    public static final Target ENABLE_MY_BANNER = Target.the("ENABLE_MY_BANNER").located(By.xpath("//input[@name='account.bannerOption']"));
    public static final Target SAVE = Target.the("SAVE").located(By.xpath("//input[@name='newAccount']"));

}
