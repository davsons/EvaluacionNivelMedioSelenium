package PruebaNivelMedio.steps.Spotify;

import PruebaNivelMedio.test.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class steps {

    public WebDriver driver;
    public SitioSpotify sitioSpotify;
    public SpotifyValidoPlan spotifyValidoPlan;
    public SpotifyRegistrer spotifyRegistrer;
    public SpotifiValidoIngreso spotifiValidoIngreso;
    public SpotifyLegal spotifyLegal;




    @Given("Estoy en Sitio Spotify")
    public void estoy_en_sitio_spotify() {
        sitioSpotify = new SitioSpotify(driver);
        sitioSpotify.sitioprincipal();

    }

    @When("Ingreso a Premium")
    public void ingreso_a_premium() {

        spotifyValidoPlan = sitioSpotify.sitioPremium();

    }


    @Then("Individual")
    public void individual() {
        spotifyValidoPlan.goPlanIndividual();


    }

    @Then("Familiar")
    public void familiar() {
       spotifyValidoPlan.goPlanFamiliar();

    }
    @Then("Valido Plan Individual")
    public void valido_plan_individual() {
        spotifyValidoPlan.goPlanIndividual();
        Assert.assertTrue(spotifyValidoPlan.goPlanIndividual(), "Se esperaba la palabra Individual");
    }

    @Given("Estoy en Registro de Usuario")
    public void estoy_en_registro_de_usuario() {

        spotifyRegistrer = new SpotifyRegistrer(driver);
        spotifyRegistrer.registroUsuario();

    }

    @When("vacio")
    public void vacio() throws InterruptedException {

        spotifiValidoIngreso = spotifyRegistrer.registroUsuario();
        spotifiValidoIngreso.emailVacio();

    }
    @Then("Valido Correo vacio")
    public void valido_correo_vacio() {
            //Assert.assertEquals(mensaje.getText(),"Es necesario que introduzcas tu correo electrónico.", "se esperaba el msj Es necesario que introduzcas tu correo electrónico.");
        }
    @When("incorrect")
    public void incorrect() throws InterruptedException {
        spotifiValidoIngreso = spotifyRegistrer.registroUsuario();
        spotifiValidoIngreso.emailInvalido();
    }


    @Then("Valido Correo incorrect")
    public void valido_correo_incorrect() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("existent")
    public void existent() throws InterruptedException {
        spotifiValidoIngreso = spotifyRegistrer.registroUsuario();
        spotifiValidoIngreso.emailExistente();
    }


    @Then("Valido Correo existent")
    public void valido_correo_existent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    @Then("Valido Plan Familiar")
    public void valido_plan_familiar() {
        spotifyValidoPlan.goPlanFamiliar();
        Assert.assertTrue(spotifyValidoPlan.goPlanFamiliar(), "Se esperaba la palabra Familiar");
    }


    @When("Ingreso a Sitio Legal")
    public void ingreso_a_sitio_legal() {
        spotifyLegal = new SpotifyLegal(driver);
        spotifyLegal.ingresoLegal();
        //driver.get("https://www.spotify.com/uy/legal/end-user-agreement/");
    }

    @Then("Disfutando Spotify")
    public void disfutando_spotify() {
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());
        boolean Disfrutando = false;
        for (WebElement a1 : a) {
            System.out.println(a1.getText());
            if (a1.getText().equals("Disfrutando Spotify")) {

                Disfrutando = true;
            }

        }
        Assert.assertTrue(Disfrutando, "Se esperaba Disfrutando Spotify");
    }

    @Then("Pagos cancelaciones")
    public void pagos_cancelaciones() {
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());
        boolean Pagos = false;
        for (WebElement a1 : a) {
            System.out.println(a1.getText());
            if (a1.getText().equals("Pagos, cancelaciones y periodo de reflexión")) {

                Pagos = true;
            }

        }
        Assert.assertTrue(Pagos, "Se esperaba Pagos, cancelaciones y periodo de reflexion");
    }

    @Then("Nuestro servicio")
    public void nuestro_servicio() {
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());
        boolean Usos = false;
        for (WebElement a1 : a) {
            System.out.println(a1.getText());
            if (a1.getText().equals("Uso de nuestro servicio")) {

                Usos = true;
            }

        }
        Assert.assertTrue(Usos, "Se esperaba Uso de nuestro servicio");
    }



}
