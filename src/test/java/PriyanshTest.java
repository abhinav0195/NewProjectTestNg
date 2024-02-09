import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PriyanshTest {

    WebDriver driver;
    @Test
    public void autosuggestion(){

         driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.findElement(By.id("autocomplete")).sendKeys("india");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

       List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='ui-id-1']"));


     System.out.println(ele.size());
       for (WebElement w : ele){
System.out.print(w.getText());
if(w.getText().equalsIgnoreCase("india")){
    w.click();
}

       }


    }


}
