package lippia.web.steps;

import io.cucumber.java.en.When;
import lippia.web.services.RegistrationServices;

public class RegistrationSteps {

    @When("el usuario ingresa un Mail (.*) y Pass (.*)")
    public void elUsuarioIngresaUnMailYPass(String arg0, String arg1) {
        RegistrationServices.register(arg0, arg1);
    }
}
