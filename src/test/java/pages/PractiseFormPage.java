package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ResultsTableComponent;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PractiseFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();

    SelenideElement firstNameInput = $("[id=firstName]"),
    lastNameInput = $("[id=lastName]");

    public PractiseFormPage openPage (){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public PractiseFormPage setFirstName(String value ){
        firstNameInput.setValue(value);
        return this;
    }

    public PractiseFormPage setLastName(String value ){
        lastNameInput.setValue(value);
        return this;
    }

    public PractiseFormPage setEmail(String value ){
        $("[id=userEmail]").setValue(value);
        return this;
    }


    public PractiseFormPage setGender(String gender){
        $("#genterWrapper").$(byText("Female")).click();
        return this;
    }

    public PractiseFormPage setNumber(String value){
        $("[id=userNumber]").setValue(value);
        return this;
    }

    public PractiseFormPage setAddress(String value){
        $("[id=currentAddress]").setValue(value);
        return this;
    }

    public PractiseFormPage setDateOfBirth(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public PractiseFormPage setSubject(String subject){
        $("#subjectsInput").sendKeys("Maths");
        $("#subjectsInput").pressEnter();
        return this;
    }

    public PractiseFormPage setHobbies(String hobby){
        $("#hobbiesWrapper").$(byText("Reading")).click();
        return this;
    }

    public PractiseFormPage uploadPicture(){
        $("#uploadPicture").uploadFile (new File("src/test/resources/screenshot.png"));
        return this;
    }

    public PractiseFormPage setState(String value){
        $("[id=react-select-3-input]").setValue(value).pressEnter();
        return this;
    }

    public PractiseFormPage setCity(String value){
        $("[id=react-select-4-input]").setValue(value).pressEnter();
        return this;
    }

    public PractiseFormPage submitForm(){
        $("[id=submit]").click();
        return this;
    }

    public PractiseFormPage checkResult(String key, String value){
        resultsTableComponent.checkResult(key, value);
        return this;
    }

    public PractiseFormPage clearFirstName(String value ){
        firstNameInput.clear();

        return this;
    }

    public PractiseFormPage setFullName(String firstName, String lastName ){
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);

        return this;
    }

    public PractiseFormPage setDateOfBirthWithKeys(String day, String month, String  year){
        $("#dateOfBirthInput").sendKeys(day + " " + month + "" + year);
        calendarComponent.setDate(day, month, year);
        return this;
    }
}
