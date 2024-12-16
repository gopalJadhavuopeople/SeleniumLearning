package Day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class handlingWindow {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

        driver.findElement(By.id("openwindow")).click();

        Set <String> allwindow =driver.getWindowHandles();






    }
}
