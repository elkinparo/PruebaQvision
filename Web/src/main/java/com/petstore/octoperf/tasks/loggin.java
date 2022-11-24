package com.petstore.octoperf.tasks;

import com.petstore.octoperf.models.shopingpets;
import com.petstore.octoperf.userinterfaces.Loggin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class loggin implements Task
{
    shopingpets data;
    public loggin (shopingpets data){this.data=data;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(Loggin.SIG_IN),
                Enter.theValue(data.getNAME()).into(Loggin.USER),
                Enter.theValue(data.getPASWORD()).into(Loggin.PASWORD),
                Click.on(Loggin.LOGIN));
    }

    public static loggin format(shopingpets data){return Tasks.instrumented(loggin.class,data);}
}
