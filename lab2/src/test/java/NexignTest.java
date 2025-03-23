import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NexignTest {


    @BeforeAll
    public static void setup() {
        Selenide.open("https://nexign.com/ru/");
    }

    @Test
    public void testCountNexignOccurrences() {

        String pageContent = $("body").getText();

        String lowerCaseContent = pageContent.toLowerCase();

        long count = lowerCaseContent.split("nexign").length - 1;

        System.out.println("Количество упоминаний 'Nexign': " + count);

    }
}
