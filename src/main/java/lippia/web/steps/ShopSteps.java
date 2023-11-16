package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.HomePageServices;
import lippia.web.services.ShopServices;

public class ShopSteps {
    @And("el usuario hace click en ShopButton")
    public void elUsuarioHaceClickEnShopButton() {
        ShopServices.ShopButton();
    }

    @And("el usuario hace click en AddToBasket")
    public void elUsuarioHaceClickEnAddToBasket() {
        ShopServices.AddToBasket();
    }

    @And("el usuario hace click en ViewBasket")
    public void elUsuarioHaceClickEnViewBasket() {
        ShopServices.ViewBasket();
    }

    @And("el usuario verifica que la taza del total sea mayor al subtotal")
    public void elUsuarioVerificaQueLaTazaDelTotalSeaMayorAlSubtotal() {
        ShopServices.Comparation();
    }

    @Then("el usuario verifica que la taza de impuestos es del {int}% para la India y {int}% para otros paises")
    public void elUsuarioVerificaQueLaTazaDeImpuestosEsDelParaLaIndiaYParaOtrosPaises(int arg0, int arg1) {
        ShopServices.Percentage();
    }
}
