package lippia.web.steps;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LoginConstants;
import lippia.web.services.LoginServices;
import lippia.web.services.UtilToolsServices;
import org.testng.Assert;

public class LoginSteps {

    @When("el usuario hace click en My_Account")
    public void elUsuarioHaceClickEnMy_Account() {
        LoginServices.My_Account();
    }

    @When("el usuario ingresa un User (.*) y Pass (.*)")
    public void elUsuarioIngresaUnUser(String arg0, String arg1) {
        LoginServices.login(arg0, arg1);
    }

    @Then("valido el mensaje de error es el siguiente (.*)")
    public void validoElMensajeDeErrorEsElSiguiente(String mensajeError) {
        Assert.assertEquals(mensajeError, ActionManager.getText(LoginConstants.Mensaje_Error_Password));
    }

    @Given("el usuario se encuentra en la URL {string}")
    public void elUsuarioSeEncuentraEnLaURL(String arg0) {
        WebActionManager.navigateTo("https://practice.automationtesting.in/");
    }

    @And("el usuario hace click en Logout_Button")
    public void elUsuarioHaceClickEnLogout_Button() {
        LoginServices.Logout_Button();
    }

    @Then("el usuario se encuentra con que esta fuera de sesion")
    public void elUsuarioSeEncuentraConQueEstaFueraDeSesion() {
        UtilToolsServices.verifyCurrentUrl("https://practice.automationtesting.in/my-account/");
    }
}
