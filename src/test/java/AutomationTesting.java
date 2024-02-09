import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AutomationTesting {
WebDriver driver;
    @Test
   public void radiobutton(){

         driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.xpath("//fieldset/label[@for='radio1']/input[@name='radioButton']"));

        ele.click();

        Boolean b = ele.isSelected();
        System.out.print(b);

    }
@AfterMethod
    void teardown(){
        driver.quit();

}


}
