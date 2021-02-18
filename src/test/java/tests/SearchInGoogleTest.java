package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchInGoogleTest {

    @Test
    void checkGoogleSearch() {
        open("https://www.google.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $("h3").shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java")).click();
        $("header").shouldHave(text("Selenide")).should(exist);

    }
}
/*
1. не ясно что проверяем, поиск гугла или переход по найденной ссылке на конкретный сайт.
следует заменить проверку на проверку результатов пойска на странице гугла.
к примеру $("#rcnt").shouldHave(text("selenide.org"));
В остальном очень круто =)
 */