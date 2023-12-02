package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.id("L2AGLb")).click();  //принять cookies

        String title = driver.getTitle();
        System.out.println(driver.getTitle());

        String url = driver.getCurrentUrl();
        System.out.print(driver.getCurrentUrl());

        driver.quit();
    }
}
