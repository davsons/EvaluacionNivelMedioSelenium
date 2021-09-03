package PruebaNivelMedio.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Stream;

public class SpotifyValidoPlan {

    public WebDriver driver;

    public SpotifyValidoPlan(WebDriver remoteDriver) {

        driver = remoteDriver;
    }

    public boolean goPlanIndividual() {
        List<WebElement> h3s = driver.findElements(By.tagName("h3"));
        System.out.println(h3s.size());
        boolean Individual = false;
        for (WebElement h3 : h3s) {
            System.out.println(h3.getText());
            if (h3.getText().equals("Individual")) {

                Individual = true;
            }

        }
        return Individual;
        //Assert.assertTrue(Individual, "Se esperaba la palabra Individual");

    }

    public boolean goPlanFamiliar() {

        List<WebElement> h3s = driver.findElements(By.tagName("h3"));
        System.out.println(h3s.size());
        boolean Familiar = false;
        for (WebElement h3 : h3s) {
            System.out.println(h3.getText());
            if (h3.getText().equals("Familiar")) {

                Familiar = true;
            }

        }

        return Familiar;
        //Assert.assertTrue(Familiar, "Se esperaba la palabra Familiar");

    }
}








































