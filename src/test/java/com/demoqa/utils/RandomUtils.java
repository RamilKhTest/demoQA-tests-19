package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils{
    static String[] genders = {"Male", "Female", "Other"};
    static String[] hobbies = {"Sports", "Reading", "Music"};
    static String[] subjects = {"Math", "Biology", "English", "Chemistry", "Accounting", "Arts"};

    public static void main(String[] args) {
        System.out.println(setRandomEmailAddress());
    }

    public static String generateRandomString(int len) {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String setRandomFirstName() {
        return new Faker().name().firstName();
    }

    public static String setRandomLastName() {
        return new Faker().name().firstName();
    }

    public static String setRandomEmailAddress() {
        return new Faker().internet().emailAddress();
    }

    public static String setRandomAddress() {
        return new Faker().name().firstName();
    }

    public static String setRandomPhone() {
        return "9" + RandomUtils.generateRandomInt(1111, 5555) + RandomUtils.generateRandomInt(44444, 99999);
    }

    public static String setRandomItemFromArray(String[] value) {
        int index = generateRandomInt(0, value.length - 1);
        return value[index];
    }

    public static String setRandomGender() {
        return setRandomItemFromArray(genders);
    }

    public static String setRandomHobbies() {
        return setRandomItemFromArray(hobbies);
    }

    public static String setRandomSubjects() {
        return setRandomItemFromArray(subjects);
    }
}
