package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomeConstants;
import lippia.web.services.HomeService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeSteps {

    @Given("el usuario se encuentra en la URL (.*)")
    public void elUsuarioSeEncuentraEnLaURLHttpsPracticeAutomationtestingIn(String url){
        WebActionManager.navigateTo("https://practice.automationtesting.in");
    }

    @Then("se puede comprobar que hay tres sliders")
    public void sePuedeComprobarQueHayTresSliders() {
        HomeService.Javascript();
        HomeService.HTML();
        HomeService.Selenium_Ruby();
    }

    @Given("el usuario hace click en Shop_Button")
    public void elUsuarioHaceClickEnShop_Button() {
        HomeService.Shop_Button();
    }

    @When("el usuario hace click en Home_Button")
    public void elUsuarioHaceClickEnHome_Button() {
        HomeService.Home_Button();
    }

    @And("el usuario hace click en Slide_Button")
    public void elUsuarioHaceClickEnSlide_Button() throws InterruptedException {
        HomeService.Slide_Button();
    }

    @Then("se puede comprobar que hay tres arrivals")
    public void sePuedeComprobarQueHayTresArrivals() {
        HomeService.Arrival1();
        HomeService.Arrival2();
        HomeService.Arrival3();
    }

    @And("el usuario hace click en un Arrival_Image")
    public void elUsuarioHaceClickEnUnArrival_Image() {
        HomeService.Arrival_Image();
    }

    @Then("se puede comprobar que las imagenes son navegables")
    public void sePuedeComprobarQueLasImagenesSonNavegables() {
    }
}
