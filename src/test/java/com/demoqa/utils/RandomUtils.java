package com.demoqa.utils;

import com.github.javafaker.Faker;
import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.time.YearMonth;

public class RandomUtils{
    static String[] genders = {"Male", "Female", "Other"};
    static String[] hobbies = {"Sports", "Reading", "Music"};
    static String[] subjects = {"Math", "Biology", "English", "Chemistry", "Accounting", "Arts"};
    static String[] month = {"January", "February", "March", "April", "May", "June", "July" , "August", "September", "October", "November", "December"};
    private static String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    public static String[] citiesInNCR = new String[] {"Delhi", "Gurgaon", "Noida"};
    public static String[] citiesInUttarPradesh = new String[] {"Agra", "Lucknow", "Merrut"};
    public static String[] citiesInHaryana = new String[] { "Karnal", "Panipat"};
    public static String[] citiesInRajasthan = new String[] {"Jaipur", "Jaiselmer"};
    public static String fileName= "image.jpg";



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

    public static String getMonthName(int monthNum) {
        String monthName = month[monthNum];
        return monthName;
    }

    public static String setRandomState() {
        return setRandomItemFromArray(states);
    }

    public static String generateRandomCity(String indianState) {
        switch (indianState) {
            case "NCR": {
                return setRandomItemFromArray(citiesInNCR);
            }
            case "Uttar Pradesh": {
                return setRandomItemFromArray(citiesInUttarPradesh);
            }
            case "Haryana": {
                return setRandomItemFromArray(citiesInHaryana);
            }
            case "Rajasthan": {
                return setRandomItemFromArray(citiesInRajasthan);
            }
        }
        return null;
    }
}
