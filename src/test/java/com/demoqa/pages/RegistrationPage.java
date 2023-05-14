package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    ResultsModal resultsModal = new ResultsModal();
    //locators
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement emailInput = $("#userEmail");
    SelenideElement genderInput = $("#genterWrapper");
    SelenideElement phoneInput = $("#userNumber");
    SelenideElement dayOfBirthInput = $("#dateOfBirthInput");
    SelenideElement subjectsInput = $("#subjectsInput");
    SelenideElement hobbiesRadiobutton = $("#hobbiesWrapper");
    SelenideElement picture = $("#uploadPicture");
    SelenideElement setAddress = $("#currentAddress");
    SelenideElement stateInput = $("#state");
    SelenideElement state =  $("#stateCity-wrapper");
    SelenideElement cityInput =  $("#city");
    SelenideElement city =  $("#stateCity-wrapper");
    SelenideElement submitButton =  $("#submit");



    //actions

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }
    public RegistrationPage setFirstName(String name) {
        firstNameInput.setValue(name);
        return this;
    }
    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }
    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage clickGender(String gender) {
        genderInput.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setPhone(String phone) {
        phoneInput.setValue(phone);
        return this;
    }
    public RegistrationPage setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbiesRadiobutton(String value) {
        hobbiesRadiobutton.$(byText(value)).click();
        return this;
    }

    public RegistrationPage upploadPicture(String value) {
        picture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setAddress(String value) {
        setAddress.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        stateInput.click();
        state.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        cityInput.click();
        city.$(byText(value)).click();
        return this;
    }

    public RegistrationPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dayOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage verifyRegistrationModal() {
        resultsModal.verifyModal();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        resultsModal.verifyResult(key, value);
        return this;
    }

}
