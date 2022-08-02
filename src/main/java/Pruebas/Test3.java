package Pruebas;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

    @Test
    public void Test3() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Calidad Software\\Drivers\\chromedriver.exe");

        WebDriver A = new ChromeDriver();
        WebDriverWait B = new WebDriverWait(A, 10);
        A.manage().window().maximize();
        A.get("https://www.youtube.com");

        A.findElement(By.name("search_query")).sendKeys("COSTA RICA 4K 60fps");
        A.findElement(By.id("search-icon-legacy")).click();
        A.navigate().to("https://www.youtube.com/watch?v=LXb3EKWsInQ&t=2s");

        A.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        A.navigate().to("https://www.youtube.com");
        A.findElement(By.linkText("Historial")).click();

    }
}
