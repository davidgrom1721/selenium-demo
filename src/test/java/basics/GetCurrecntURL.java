package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetCurrecntURL {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //1. Navigate to homepage
        driver.get("https://www.instagram.com/");

        //2. Verify that the URL of the homepage is "https://www.instagram.com/"
        String expectedURL = "https://www.instagram.com/";

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);




    }
}
