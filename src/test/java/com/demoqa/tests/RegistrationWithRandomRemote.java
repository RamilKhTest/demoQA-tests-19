package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationWithRandomRemote extends TestBaseRemoteTest {

    @Test
    @Tag("remote")
    void firstLesson() {
        Configuration.holdBrowserOpen = true;
        //Открываем страницу
        open("/automation-practice-form");
        //Имя
        $("#firstName").setValue("Рамиль");
        //Фамилия
        $("#lastName").setValue("Хакимов");
        //Почта
        $("#userEmail").setValue("rkhakimov@yandex.ru");
        //Пол
        $("#genterWrapper").$(byText("Male")).click();
        //Номер телефона
        $("#userNumber").setValue("9655913115");
        //дата рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__day--006:not(.react-datepicker__day--outside-month)").click();
        //Предметы
        $("#subjectsInput").setValue("Math").pressEnter();
        //Хобби
        $("#hobbiesWrapper").$(byText("Sports")).click();
        //Загрузка файла
        $("#uploadPicture").uploadFromClasspath("image.jpg");
        //Адрес
        $("#currentAddress").setValue("г.Казань");
        //Страна и город
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();
        //Окно подтверждения
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Рамиль"),
                text("Хакимов"),
                text("rkhakimov@yandex.ru"),
                text("9655913115"),
                text("Male"),
                text("06 December,1989"),
                text("Sports"),
                text("Math"),
                text("г.Казань"),
                text("image.jpg"),
                text("NCR"),
                text("Delhi"));
    }
}
