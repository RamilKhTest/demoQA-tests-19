package com.demoqa.tests;

import com.demoqa.utils.RandomUtils;
import org.junit.jupiter.api.Test;

public class RegistrationWithRandom extends TestBaseTest {

    @Test
    void firstLessonWithPageObject() {
        String firstName = RandomUtils.setRandomFirstName();
        String lasttName = RandomUtils.setRandomLastName();
        String address = RandomUtils.setRandomAddress();
        String email = RandomUtils.setRandomEmailAddress();
        String phone = RandomUtils.setRandomPhone();
        String gender = RandomUtils.setRandomGender();
        String hobbies = RandomUtils.setRandomHobbies();
        String subjects = RandomUtils.setRandomSubjects();


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lasttName)
                .setEmail(email)
                .clickGender(gender)
                .setPhone(phone)
                .setBirthDate("06", "December", "1989")
                .setSubjectsInput(subjects)
                .setHobbiesRadiobutton(hobbies)
                .uploadPicture("image.jpg")
                .setAddress(address)
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmitButton()
                .verifyRegistrationModal()
                .verifyResult("Student Name", firstName + " " + lasttName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", "06 December,1989")
                .verifyResult("Subjects", subjects)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", "image.jpg")
                .verifyResult("Address", address)
                .verifyResult("State and City", "NCR Delhi");
    }
}
