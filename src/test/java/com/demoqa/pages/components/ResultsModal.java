package com.demoqa.pages.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsModal {
    SelenideElement locatorModalTitle = $("#example-modal-sizes-title-lg");
    SelenideElement locatorTableResult = $(".table-responsive");
    public void verifyModal() {
        locatorModalTitle.shouldHave(text("Thanks for submitting the form"));
    }

    public void verifyResult(String key, String value) {
        locatorTableResult.$(byText(key)).sibling(0).shouldHave(text(value));
    }
}
