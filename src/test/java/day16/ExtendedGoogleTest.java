package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtendedGoogleTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Открыть google.com
        driver.get("https://www.google.com/");

        driver.findElement(By.id("L2AGLb")).click(); //принять cookies

        //Набрать в строке поиска «погода минск»
        driver.findElement(By.name("q")).sendKeys("погода минск");

        //Кликнуть на 1-е предложение из выпадающего списка
        WebElement element = driver.findElement(By.cssSelector(".mus_il"));
        element.click();

        //На виджете weather.com выбрать погоду на завтра
        WebElement weatherWidgetDay = driver.findElement(By.xpath("//div[contains(@class,'wob_df wob_ds')]"));
        weatherWidgetDay.click();

        //Вывести в консоль температуру в 12:00
        WebElement weatherAtTwelveHour = driver.findElement(By.xpath("//*[contains(@aria-label, 'Celsius niedziela, 12:00')][1]"));
        String[] weather = weatherAtTwelveHour.getAttribute("aria-label").split("°");
        System.out.println("Погода на завтра в 12: " + weather[0]);

    }
}
