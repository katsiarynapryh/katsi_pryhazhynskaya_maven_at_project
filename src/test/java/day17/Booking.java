package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Перейти на сайт booking.com
        driver.get("https://www.booking.com/");

        //закрыть всплывающее окно ?

        driver.findElement(By.id("onetrust-accept-btn-handler")).click(); //принять cookies

        //Найти отели для города «Париж» с проживанием на 7 ночей заездом через 3 дня, для 4 взрослых в 2 номерах
        driver.findElement(By.name("ss")).sendKeys("Париж");

//        WebElement elementCity = driver.findElement();
//        elementCity.click();


    }
}
