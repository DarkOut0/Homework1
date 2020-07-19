package com.google;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class Test1 extends WebDriverSettings {
    @Test
    @Description(value = "Тест количества заголовков")
    public void testForElement() {
        PageObjectGoogle googlePO = new PageObjectGoogle(chromeDriver, "Гладиолус");
        googlePO.getCollectResult();
        Steps.checkAmountHeaders(googlePO);
    }

    @Test
    @Description(value = "Проверка на присутсвие текста в заголовке \"Гладиолус - Википедия\" ")
    public void testTextInHeaders(){
        PageObjectGoogle googlePO = new PageObjectGoogle(chromeDriver, "Гладиолус");
        googlePO.getCollectResult();
        Steps.checkTextInHeaders(googlePO, "Шпажник - Википедия");
    }

}

