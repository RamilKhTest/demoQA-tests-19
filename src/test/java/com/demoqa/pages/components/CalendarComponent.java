package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class CalendarComponent {

    SelenideElement monthOfBirth = $(".react-datepicker__month-select");
    SelenideElement yearOfBirth =  $(".react-datepicker__year-select");
    public void setDate(String day, String month, String year) {
        monthOfBirth.selectOption(month);
        yearOfBirth.selectOption(year);

        String locatorDayPicker = format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)", day);
        $(locatorDayPicker).click();
    }
}
