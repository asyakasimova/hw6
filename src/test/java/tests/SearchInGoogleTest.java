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
        $("#rcnt").shouldHave(text("selenide.org"));

    }
}