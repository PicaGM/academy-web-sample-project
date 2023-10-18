package lippia.web.steps;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.AccountConstants;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;
import lippia.web.services.LoginService;
import lippia.web.services.TestServices;
import org.testng.Assert;

public class LoginSteps {

    @When("el usuario hace click en My_Account")
    public void elUsuarioHaceClickEnMy_Account() {
        LoginService.My_Account();
    }

    @When("el usuario ingresa un User (.*) y Pass (.*)")
    public void elUsuarioIngresaUnUser(String arg0, String arg1) {
        TestServices.login(arg0, arg1);
    }

    @And("hace click en Login_Button")
    public void haceClickEnLogin_Button() {
        LoginService.Login_Button();
    }

    @Then("el usuario inicia sesion correctamente")
    public void elUsuarioIniciaSesionCorrectamente() {
        Assert.assertFalse(false);
    }

    @Then("el usuario se encuentra con que no se puede iniciar sesion")
    public void elUsuarioSeEncuentraConQueNoSePuedeIniciarSesion() {
        Assert.assertFalse(false);
    }

    @Then("valido el mensaje de error es el siguiente (.*)")
    public void validoElMensajeDeErrorEsElSiguiente(String mensajeError) {
        Assert.assertEquals(mensajeError, ActionManager.getText(LoginConstants.Mensaje_Error_Password));
    }
}
