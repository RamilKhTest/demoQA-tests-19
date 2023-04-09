package com.demoqa;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class firstLessonTest extends testBaseTest {
    //Имя
    private String locatorFirstName = "//input[@id='firstName']";
    //Фамилия
    private String locatorLastName = "//input[@id='lastName']";
    //Емейл
    private String locatorInputEmail = "//input[@id='userEmail']";
    //Пол
    private String locatorRadioButtonMale = "//label[@for='gender-radio-1']";
    //Номер телефона
    private String locatorInputMobileNumber = "//input[@id='userNumber']";

    //Дата рождения
    private String locatorInputDateOfBirth = "//input[@id='dateOfBirthInput']";
    private String locatorListMonthSelect = "//select[@class='react-datepicker__month-select']";
    private String locatorMonth = "//select[@class='react-datepicker__month-select']/option[@value='11']";
    private String locatorListYearSelect = "//select[@class='react-datepicker__year-select']";
    private String locatorYear = "//select[@class='react-datepicker__year-select']/option[@value='1989']";
    private String locatorDay = "//div[contains(@aria-label, 'December')][text()='6']";

    //Предметы
    private String locatorInputSubjects = "//div[@id='subjectsContainer']//input";
    //Хобби
    private String locatorCheckboxHobbiesSport = "//div[@id='hobbiesWrapper']//label[@for='hobbies-checkbox-1']";
    //Адрес
    private String locatorInputCurrentAddress = "//textarea[@placeholder='Current Address']";
    //Загрузка файла
    private String locatorChooseFile = "//input[@id='uploadPicture']";
    //Страна и город
    private String locatorListState = "//div[@id='stateCity-wrapper']/div[@class='col-md-4 col-sm-12']/div[@id='state']";
    //private String locatorStateNCR = "";
    private String locatorListCity = "//div[@id='stateCity-wrapper']/div[@class='col-md-4 col-sm-12']/div[@id='city']";
    private String locatorStateNCR = "//div[@id='react-select-3-option-0' and text()='NCR']";
    private String locatorCityDelhi = "//div[@id='react-select-4-option-0' and text()='Delhi']";
    private String locatorButtonSubmit = "//button[@id='submit']";
    private String locatorModalTitleSuccess = "//div[contains(@class,'modal-title')]";
    //private String locatorListCityDelhi = "";

    @Test
    void firstLesson() {
        Configuration.holdBrowserOpen = true;
        //поиск через xpath
        open("/automation-practice-form");
        $(By.xpath(locatorFirstName)).setValue("Рамиль");
        $(By.xpath(locatorLastName)).setValue("Хакимов");
        $(By.xpath(locatorInputEmail)).setValue("rkhakimov@yandex.ru");
        $(By.xpath(locatorRadioButtonMale)).click();
        $(By.xpath(locatorInputMobileNumber)).setValue("9655913115");
        $(By.xpath(locatorInputDateOfBirth)).click();
        $(By.xpath(locatorListMonthSelect)).click();
        $(By.xpath(locatorMonth)).click();
        $(By.xpath(locatorListYearSelect)).click();
        $(By.xpath(locatorYear)).click();
        $(By.xpath(locatorDay)).click();
        $(By.xpath(locatorCheckboxHobbiesSport)).click();
        $(By.xpath(locatorInputSubjects)).setValue("Math").pressEnter();
        $(By.xpath(locatorInputCurrentAddress)).setValue("г.Казань");
        $(By.xpath(locatorChooseFile)).uploadFromClasspath("image.jpg");
        $(By.xpath(locatorListState)).click();
        $(By.xpath(locatorStateNCR)).click();
        $(By.xpath(locatorListCity)).click();
        $(By.xpath(locatorCityDelhi)).click();
        $(By.xpath(locatorButtonSubmit)).click();
        $(By.xpath(locatorModalTitleSuccess)).shouldHave(text("Thanks for submitting the form"));



/*
            //поиск через css селекторы
            open("/automation-practice-form");
            $("#firstName").setValue("Рамиль");
            $("#lastName").setValue("Хакимов");
            $("#userEmail").setValue("rkhakimov@yandex.ru");
            $("[for=gender-radio-1]").click();
            $("#userNumber").setValue("9655913115");
            //дата рождения
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").click();
            $(By.xpath("//select[@class='react-datepicker__month-select']/option[@value='11']")).click();
            $(".react-datepicker__year-select").click();
            $(By.xpath("//select[@class='react-datepicker__year-select']/option[@value='1989']")).click();
            $(By.xpath("//div[contains(@aria-label, 'December')][text()='6']")).click();
            $("#subjectsInput").setValue("Math").pressEnter();
            $("#hobbiesWrapper #hobbies-checkbox-1").setSelected(true);
            $("#Current Address").setValue("г.Казань");
*/
    }
}

