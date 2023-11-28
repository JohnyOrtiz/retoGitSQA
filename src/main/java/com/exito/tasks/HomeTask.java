package com.exito.tasks;
/*
 * @(#) HomeTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.exito.interactions.Wait;
import com.exito.ui.HomeUI;
import com.exito.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<Map<String, String>> datos;

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/searchdata.xlsx", "items");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Wait.Element(HomeUI.BTN_CLOSE_AD),
                Click.on(HomeUI.BTN_CLOSE_AD),
                Enter.theValue(datos.get(0).get("item")).into(HomeUI.TXT_SEARCH).thenHit(Keys.ENTER),
                Click.on(HomeUI.SPAN_ADD),
                Click.on(HomeUI.BTN_CART)
        );
    }

    public static Performable on(){
        return instrumented(HomeTask.class);
    }
}
