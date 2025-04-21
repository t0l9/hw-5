package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void drugAndDropSelenideTest(){
        open("/drag_and_drop");
        $("#column-a").dragAndDrop((DragAndDropOptions) $("#column-b"));
        //Не работает синтаксис
        $("#column-a header").shouldHave(text("B"));
        sleep(5000);
    }


}
