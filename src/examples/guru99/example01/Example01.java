package guru99.example01;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example01 {

    @Test
    public void Example01Test01Title() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title matches");
        driver.close();

    }



}
