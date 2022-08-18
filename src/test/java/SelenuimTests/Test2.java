package SelenuimTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    //Poder reproducir un video en Youtube
    
    @Test
    public void Test2() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Calidad Software\\Driver\\chromedriver.exe");
        WebDriver A = new ChromeDriver();
        A.manage().window().maximize();
        A.get("https://www.youtube.com");

        A.findElement(By.name("search_query")).sendKeys("COSTA RICA 4K 60fps");
        A.findElement(By.id("search-icon-legacy")).click();
        A.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        A.navigate().to("https://www.youtube.com/watch?v=LXb3EKWsInQ&t=2s");

    }
}
