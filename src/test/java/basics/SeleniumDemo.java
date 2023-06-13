package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duotech.io/");

        String expectedTitle = "Software QA Automation Engineer program | SDET | QA School | Software Testing";
        String actualTitle = driver.getTitle();

//        if(actualTitle.equalsIgnoreCase(expectedTitle)){
//            System.out.println("Test passed");
//        }else{
//            System.out.println("Test failed");
//            System.out.println("EXPECTED TITLE: " + expectedTitle);
//            System.out.println("ACTUAL TITLE: " + actualTitle);
//        }


        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();



    }
}
