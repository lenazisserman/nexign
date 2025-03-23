import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class NexignNavigationTest {


    @BeforeAll
    public static void setup() {
        Selenide.open("https://nexign.com/ru/");
    }

    @Test
    public void testNexignNavigation() {

        SelenideElement productsAndSolutions = $x("/html/body/div[1]/main/header/div/div/div[2]/nav/ul/li[1]");
        productsAndSolutions.shouldBe(visible).click();


        SelenideElement itTools = $x("/html/body/div[1]/main/header/div/div/div[2]/nav/ul/li[1]/ul/li[5]/span");
        itTools.shouldBe(visible).click();


        SelenideElement nexignNord = $x("/html/body/div[1]/main/header/div/div/div[2]/nav/ul/li[1]/ul/li[5]/ul/li/ul[1]/li[2]/a");
        nexignNord.shouldBe(visible).click();


    }
}