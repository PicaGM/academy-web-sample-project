package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AccountService;
import lippia.web.services.TestServices;

public class AccountSteps extends PageSteps {

    @And("el usuario hace click en Dashboard")
    public void elUsuarioHaceClickEnDashboard() {
        AccountService.Dashboard();
    }

    @Then("el usuario puede confirmar el contenido de la Dashboard")
    public void elUsuarioPuedeConfirmarElContenidoDeLaDashboard() {
    }

    @And("el usuario hace click en Orders")
    public void elUsuarioHaceClickEnOrders() {
        AccountService.Orders();
    }

    @Then("el usuario puede confirmar el contenido de Orders")
    public void elUsuarioPuedeConfirmarElContenidoDeOrders() {
    }
}
