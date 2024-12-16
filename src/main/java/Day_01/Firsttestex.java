package Day_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firsttestex {

    @Test
    public static void launchbrowser() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.close();



    }
}
