package Pruebas;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    
    // Caso de prueba 2: Buscar un video en Youtube

    @Test
    public void Test1() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Calidad Software\\Driver\\chromedriver.exe");

        WebDriver A = new ChromeDriver();
        A.manage().window().maximize();
        A.get("https://www.youtube.com");

        A.findElement(By.name("search_query")).sendKeys("COSTA RICA 4K 60fps");
        A.findElement(By.id("search-icon-legacy")).click();

    }
}
