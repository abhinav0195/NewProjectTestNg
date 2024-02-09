package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Main12 {

    WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    @Test(priority = 0, invocationCount =1)
    public void login(ITestContext testContext) {
        driver.findElement(By.id("item_4_title_link")).click();
        int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
    }

    @Test(priority = 1)
    public void verifylogin() {

        String applogotext = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        System.out.print(applogotext);
        Assert.assertEquals("Swag Labs", applogotext);

        Assert.assertFalse(Boolean.parseBoolean("Swag Lab"), applogotext);


    }


    @AfterMethod
    public void teardown() {

    driver.quit();
    }


}
