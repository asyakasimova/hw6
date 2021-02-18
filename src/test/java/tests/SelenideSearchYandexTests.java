package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSearchYandexTests {

  @Test
  void checkGoogleSearch() {
    open("https://yandex.ru/");
    $("#text").setValue("selenide").pressEnter();
    $("#search-result").shouldHave(text("selenide.org"));


  }

}
