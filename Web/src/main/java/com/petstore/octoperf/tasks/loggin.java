package com.petstore.octoperf.tasks;

import com.petstore.octoperf.models.Shopingpets;
import com.petstore.octoperf.userinterfaces.Logginn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class loggin implements Task {
    Shopingpets data;

    public loggin(Shopingpets data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(Logginn.SIG_IN),
                Enter.theValue(data.getNAME()).into(Logginn.USER),
                Enter.theValue(data.getPASWORD()).into(Logginn.PASWORD),
                Click.on(Logginn.LOGIN));
    }

    public static loggin format(Shopingpets data) {
        return Tasks.instrumented(loggin.class, data);
    }
}
