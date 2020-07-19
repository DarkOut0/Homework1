package com.google;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class Steps {
    @Step("Проверка количества заголовков")
    public static void checkAmountHeaders(PageObjectGoogle googlePO){
        Assertions.assertTrue(googlePO.getCollectResult().size() > 3);

    }

    @Step("Проверка на присутсвие текста в заголовке \"Гладиолус - Википедия\" ")
    public static void checkTextInHeaders(PageObjectGoogle googlePO, String name){
       Assertions.assertTrue(
                googlePO.getCollectResult()
                        .stream()
                        .anyMatch(x->x.get("NAME_PAGE")
                                .toString()
                                .contains(name))


        );
    }
}
