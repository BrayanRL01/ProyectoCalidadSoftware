package Pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Calidad Software\\Proyectos\\Prueba\\src\\main\\resources\\Drivers\\chromedriver.exe");


        WebDriver D = new ChromeDriver();

        D.get("https://www.google.com");

        D.manage().window().maximize();
        D.close();
    }
}
