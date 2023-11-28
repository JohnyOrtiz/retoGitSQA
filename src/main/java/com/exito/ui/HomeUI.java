package com.exito.ui;
/*
 * @(#) HomeUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target BTN_CLOSE_AD =Target.the("").locatedBy("//div[@id='wps-overlay-close-button']");

    public static final Target TXT_SEARCH =Target.the("").locatedBy("//input[@id='downshift-0-input']");
    public static final Target SPAN_ADD =Target.the("").locatedBy("//a[@href=\"/iphone-15-128gb-azul-102830569/p\"]//div[@class=\"exito-vtex-components-4-x-buttonDataContainer flex justify-center\"]");

    public static final Target BTN_CART =Target.the("").locatedBy("//div[@class=\"exito-header-3-x-minicartContainer \"]");

    public static final Target SPAN_ITEM_CART =Target.the("").locatedBy("//span[contains(text(),'iPhone 15 128GB Azul')]");

}
