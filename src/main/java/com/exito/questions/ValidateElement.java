package com.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateElement implements Question<Boolean> {

    private Target Element;

    public ValidateElement(Target element) {
        Element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Element.resolveFor(actor).isVisible();
    }

    public static ValidateElement isVisible(Target element) {
        return new ValidateElement(element);
    }
}
