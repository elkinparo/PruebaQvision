package com.petstore.octoperf.questions;

import com.petstore.octoperf.userinterfaces.Logginn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Logginn.MESAGE.resolveFor(actor).getText();
    }

    public static FinalMessage is() {
        return new FinalMessage();
    }
}
