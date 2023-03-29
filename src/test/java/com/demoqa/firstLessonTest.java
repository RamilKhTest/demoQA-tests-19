package com.demoqa;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class firstLessonTest extends testBaseTest{
        private String locatorFirstName = "//input[@id='firstName']";
        private String locatorLastName = "//input[@id='lastName']";
        private String locatorInputEmail = "//input[@id='userEmail']";
        private String locatorRadioButtonMale = "//label[@for='gender-radio-1']";
        private String locatorInputMobileNumber = "//input[@id='userNumber']";
        private String locatorInputDateOfBirth = "//input[@id='dateOfBirthInput']";
        private String locatorInputSubjects = "//div[contains(@class, 'subjects-auto-complete__value-container')]";
        private String locatorCheckboxHobbiesSport = "//label[@for='hobbies-checkbox-1']";
        private String locatorInputCurrentAddress = "//textarea[@placeholder='Current Address']";
        private String locatorListState = "//div[@id='stateCity-wrapper']/div[@class='col-md-4 col-sm-12']/div[@id='state']";
        //private String locatorStateNCR = "";
        private String locatorListCity = "//div[@id='stateCity-wrapper']/div[@class='col-md-4 col-sm-12']/div[@id='city']";
        //private String locatorListCityDelhi = "";

        @Test
        void firstLesson() {
            Configuration.holdBrowserOpen = true;
            open("/automation-practice-form");
            $("#firstName").setValue("Рамиль");
            $("#lastName").setValue("Хакимов");
            $("#userEmail").setValue("rkhakimov@yandex.ru");
            $("[for=gender-radio-1]").click();
            $("#userNumber").setValue("9655913115");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").click();
            $(By.xpath("//select[@class='react-datepicker__month-select']/option[@value='11']")).click();
            $(".react-datepicker__year-select").click();
            $(By.xpath("//select[@class='react-datepicker__year-select']/option[@value='1989']")).click();
            $(By.xpath("//div[contains(@aria-label, 'December')][text()='6']")).click();




            $("#subjectsInput").setValue("Math");
            $("#subjectsInput").pressEnter();


            $("#hobbiesWrapper #hobbies-checkbox-1").setSelected(true);
            $("#Current Address").setValue("г.Казань");


        }
    }

