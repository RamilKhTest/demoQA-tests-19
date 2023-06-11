package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import static com.demoqa.utils.FieldsInRegistrationModal.*;
import com.demoqa.utils.RandomUtils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("random")
public class RegistrationWithRandom extends TestBaseTest {

    @Test
    void firstLessonWithPageObject() {
        String firstName = RandomUtils.setRandomFirstName();
        String lastName = RandomUtils.setRandomLastName();
        String address = RandomUtils.setRandomAddress();
        String email = RandomUtils.setRandomEmailAddress();
        String phone = RandomUtils.setRandomPhone();
        String gender = RandomUtils.setRandomGender();
        String hobbies = RandomUtils.setRandomHobbies();
        String subjects = RandomUtils.setRandomSubjects();
        int birthYear = RandomUtils.generateRandomInt(1900, 2100);
        int birthMonthRandom = RandomUtils.generateRandomInt(1, 12);
        String monthRandomName = RandomUtils.getMonthName(birthMonthRandom);
        String yearNumber = Integer.toString(birthYear);
        int birthDay = RandomUtils.generateRandomInt(1, RegistrationPage.checkDaysInMonth(birthYear, birthMonthRandom));
        String dayNumber = Integer.toString(birthDay);
        String state = RandomUtils.setRandomState();
        String city = RandomUtils.generateRandomCity(state);
        String file = RandomUtils.fileName;

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .clickGender(gender)
                .setPhone(phone)
                .setBirthDate(dayNumber, monthRandomName, yearNumber)
                .setSubjectsInput(subjects)
                .setHobbiesRadiobutton(hobbies)
                .uploadPicture(file)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmitButton()
                .verifyRegistrationModal()
                .verifyResult(studentNameField, firstName + " " + lastName)
                .verifyResult(studentEmailField, email)
                .verifyResult(genderField, gender)
                .verifyResult(mobileField, phone)
                .verifyResult(dateBirthField, dayNumber + " "  + monthRandomName +"," +yearNumber)
                .verifyResult(subjectsField, subjects)
                .verifyResult(hobbiesField, hobbies)
                .verifyResult(pictureField, file)
                .verifyResult(addressField, address)
                .verifyResult(stateCityField, state + " " + city);
    }
}
