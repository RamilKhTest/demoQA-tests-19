package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseRemoteTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration. pageLoadStrategy="eager";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
