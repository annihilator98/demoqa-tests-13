package tests;

import org.junit.jupiter.api.*;

public class JUnit5Example {

    @BeforeAll
    static void beforeAll(){
        System.out.println("== something before all tests");
    }

    @BeforeEach
     void beforeEach(){
        System.out.println("== something before each tests");
    }


    @Test
    void firstTest(){
        System.out.println("==========Started firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("==========Started secondTest");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("== something after all tests");
    }

    @AfterEach
    void afterEach(){
        System.out.println("== something after all tests");
    }
}
