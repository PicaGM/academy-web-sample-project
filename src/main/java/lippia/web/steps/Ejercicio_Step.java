package lippia.web.steps;


import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.GoogleHomeService;

public class Ejercicio_Step extends PageSteps {

    @Given("^The client search for (.*)$")
    public void theClientSearchFor(String palabra) {
        GoogleHomeService.enterSearchCriteria(palabra);
        GoogleHomeService.clickSearchButton();
    }
}
