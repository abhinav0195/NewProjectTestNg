package org.example;


import org.testng.annotations.*;

public class Square {


    @BeforeSuite
    void beforesuite(){

        System.out.println("before suite");
    }
    @AfterSuite
    void aftersuite(){

        System.out.println("after suite");
    }





    @BeforeGroups("SmokeTest")
    void beforegroup(){

    System.out.println("before group");
  }
    @AfterGroups("SmokeTest")
    void aftergroup(){

        System.out.println("after group");
    }



    @BeforeTest
    void beforetest(){
        System.out.println("before test");
    }
    @AfterTest
    void aftertest(){

        System.out.println("after test");
    }


    @BeforeClass
void beforeclass(){
    System.out.println("before class");

}
@AfterClass
void afterclass(){
    System.out.println("after class");

}

    @BeforeMethod
    void beforemethod() {

        System.out.println("before method");
    }

    @AfterMethod
    void aftermethod() {

        System.out.println("after method");
    }


    @Test
    void method1 (){
        System.out.println("test medthod 1");


    }

    @Test(groups= {"SmokeTest"})
    public void WebLoginPersonalLoan()
    {
        System.out.println("Web Login Personal Loan");
    }

    @Test
    void method2() {

        System.out.println("test medthod 2");
    }

}
