package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PractiseFormPage;

import java.io.File;
import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTestsWithPageObjects extends TestBase{

    TestData testData = new TestData();

    @Test
    @Tag("home")
    void successfulTest (){

        practiseFormPage
                .openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setNumber(testData.phone)
                .setAddress(testData.address)
                .setDateOfBirth(testData.day, testData.month, testData.year)
                .setSubject(testData.subject)
                .setHobbies(testData.hobby)
                .uploadPicture()
                .setState(testData.state)
                .setCity(testData.city)
                .submitForm();

        practiseFormPage
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Date of Birth", testData.dateOfBirth)
                .checkResult("Student Email", testData.email)
                .checkResult("Address", testData.address);
    }
}
