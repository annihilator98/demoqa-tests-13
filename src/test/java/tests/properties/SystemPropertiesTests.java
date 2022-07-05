package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Tag("simple_test")
    @Test
    void someTest1(){
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Tag("simple_test")
    @Test
    void someTest2(){
        System.setProperty("browser", "safari");

        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Tag("simple_test")
    @Test
    void someTest3(){
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // opera
    }

    @Tag("simple_test")
    @Test
    void someTest4 (){
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // safari
    }

    @Tag("simple_test")
    @Test
    void someTest5 (){
        System.setProperty("anyValue", "any text");
        String text = System.getProperty("anyValue", "some text");
        System.out.println(text); // any text
    }

    @Test
    @Tag("test6")
    void someTest6 (){
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "101");
        String browserSize = System.getProperty("browserSize", "1920x1080");

        System.out.println(browser); //chrome
        System.out.println(version); //101
        System.out.println(browserSize); //1920x1080
    }

    @Test
    @Tag("hello")
    void someTest7(){

        System.out.println("Hello " + System.getProperty("anyText")); // any text

        //gradle clean properties_test6 hello_test -DanyText=world!
        //Hello world!
    }
}
