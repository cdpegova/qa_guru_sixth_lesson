package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class First {

    @BeforeEach
    void beforeEach(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void openHover () {
        open("https://github.com");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $(By.id("faq-subscriptions-payments")).scrollIntoView(true).click();
        $(By.id("faq-subscriptions-payments")).shouldHave(text("Subscriptions & Payments"));

    }
}
