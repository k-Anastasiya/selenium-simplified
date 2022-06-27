import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstChromeTest {
    @Test
    public void startWebDriver(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://seleniumsimplified.com");
       Assert.assertTrue("title should start differently",
               webDriver.getTitle().startsWith("Selenium Simplified"));
        webDriver.close();
        webDriver.quit();
    }
}
