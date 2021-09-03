package PruebaNivelMedio.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SitioSpotify {

    public WebDriver driver;

    public SitioSpotify (WebDriver remoteDriver){

        driver = remoteDriver;
    }

    public void sitioprincipal(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/cl/");



    }

    public SpotifyValidoPlan sitioPremium(){

        driver.findElement(By.xpath("//*[@href='https://www.spotify.com/cl/premium/']")).click();
        SpotifyValidoPlan spotifyValidoPlan = new SpotifyValidoPlan(driver);
        return spotifyValidoPlan;
    }


}
