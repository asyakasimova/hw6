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
