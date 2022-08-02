package SelenuimTests;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

    @Test
    public void Test4() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Calidad Software\\Drivers\\chromedriver.exe");

        WebDriver A = new ChromeDriver();
        A.manage().window().maximize();
        A.get("https://www.youtube.com");
        A.findElement(By.linkText("Suscripciones")).click();
       
    }
}
