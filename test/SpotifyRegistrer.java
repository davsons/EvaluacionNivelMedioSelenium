package PruebaNivelMedio.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyRegistrer {
    public WebDriver driver;

    public SpotifyRegistrer (WebDriver remoteDriver){

        driver = remoteDriver;
    }

    public SpotifiValidoIngreso registroUsuario(){

        System.out.println("Imprimir prueba ------>********");

        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/cl/");
        driver.findElement(By.xpath("//*[@href=\"https://www.spotify.com/cl/signup/\"]")).click();
        SpotifiValidoIngreso spotifiValidoIngreso = new SpotifiValidoIngreso(driver);
        return spotifiValidoIngreso;

    }
}
