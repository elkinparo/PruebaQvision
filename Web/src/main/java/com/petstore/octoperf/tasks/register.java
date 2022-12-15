package com.petstore.octoperf.tasks;

import com.petstore.octoperf.models.RegisterUser;
import com.petstore.octoperf.userinterfaces.Logginn;
import com.petstore.octoperf.userinterfaces.Register;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class register implements Task
{
  private String name,pasword;
  RegisterUser data;

    public register(String name, String pasword, RegisterUser data) {
        this.name = name;
        this.pasword = pasword;
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        name = data.getUserID();
        pasword = data.getPassword();
        actor.attemptsTo(
                Click.on(Register.REGISTER_NOW),
                Enter.theValue(name).into(Register.USER_ID),
                Enter.theValue(pasword).into(Register.NEW_PASSWORD),
                Enter.theValue(pasword).into(Register.REPEAT_PASSWORD),
                Enter.theValue(data.getFirstName()).into(Register.FIRST_NAME),
                Enter.theValue(data.getLastName()).into(Register.LAST_NAME),
                Enter.theValue(data.getEmail()).into(Register.EMAIL),
                Enter.theValue(data.getPhone()).into(Register.PHONE),
                Enter.theValue(data.getAddress1()).into(Register.ADDRESS1),
                Enter.theValue(data.getAddres2()).into(Register.ADDRESS2),
                Enter.theValue(data.getCity()).into(Register.CITY),
                Enter.theValue(data.getState()).into(Register.STATE),
                Enter.theValue(data.getZip()).into(Register.ZIP),
                Enter.theValue(data.getCountry()).into(Register.COUNTRY),
                Click.on(Register.ENABLE_MY_LIST),
                Click.on(Register.ENABLE_MY_BANNER),
                Click.on(Register.SAVE),
                Click.on(Logginn.SIG_IN),
                Enter.theValue(name).into(Logginn.USER),
                Enter.theValue(pasword).into(Logginn.PASWORD),
                Click.on(Logginn.LOGIN));
    }
    public static register format(RegisterUser data)
    {
        return Tasks.instrumented(register.class,data);
    }
}
