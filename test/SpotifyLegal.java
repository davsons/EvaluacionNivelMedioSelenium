package PruebaNivelMedio.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyLegal {

    public WebDriver driver;

    public SpotifyLegal (WebDriver remoteDriver){

        driver = remoteDriver;
    }

    public void ingresoLegal(){
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/legal/end-user-agreement/");
    }
}
