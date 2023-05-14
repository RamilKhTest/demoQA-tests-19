package com.demoqa.tests;

import static com.codeborne.selenide.Condition.text;
import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationWithPageObject extends TestBaseTest  {
    @Test
    void firstLessonWithPageObject() {
        registrationPage.openPage()
                        .setFirstName("Рамиль")
                        .setLastName("Хакимов")
                        .setEmail("rkhakimov@yandex.ru")
                        .clickGender("Male")
                        .setPhone("9655913115")
                        .setBirthDate("06", "December", "1989")
                        .setSubjectsInput("Math")
                        .setHobbiesRadiobutton("Sports")
                        .upploadPicture("image.jpg")
                        .setAddress("г.Казань")
                        .setState("NCR")
                        .setCity("Delhi")
                        .clickSubmitButton()
                        .verifyRegistrationModal()
                        .verifyResult("Student Name", "Рамиль Хакимов")
                        .verifyResult("Student Email", "rkhakimov@yandex.ru")
                        .verifyResult("Gender", "Male")
                        .verifyResult("Mobile", "9655913115")
                        .verifyResult("Date of Birth", "06 December,1989")
                        .verifyResult("Subjects", "Maths")
                        .verifyResult("Hobbies", "Sports")
                        .verifyResult("Picture", "image.jpg")
                        .verifyResult("Address", "г.Казань")
                        .verifyResult("State and City", "NCR Delhi");
    }
}
