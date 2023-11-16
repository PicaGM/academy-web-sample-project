package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.constants.AccountConstants;
import lippia.web.services.AccountServices;
import lippia.web.services.UtilToolsServices;


public class AccountSteps {
    @And("el usuario hace click en MyAccount_Details")
    public void elUsuarioHaceClickEnMyAccount_Details() {
        AccountServices.MyAccount_Details_Button();
    }

    @Then("el usuario puede ver los detalles de su cuenta")
    public void elUsuarioPuedeVerLosDetallesDeSuCuenta() {
        UtilToolsServices.AssertTrue(AccountConstants.MyAccount_Details);
    }
}
