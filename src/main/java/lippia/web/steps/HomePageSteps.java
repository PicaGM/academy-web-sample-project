package lippia.web.steps;

import bsh.util.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomePageConstants;
import lippia.web.services.HomePageServices;
import lippia.web.services.LoginServices;
import lippia.web.services.UtilToolsServices;
import org.testng.Assert;

public class HomePageSteps {

    @And("el usuario hace click en Arrival_Image")
    public void elUsuarioHaceClickEnArrival_Image() {
        HomePageServices.Arrival_Image();
    }

    @And("el usuario hace click en AddToBasketButton")
    public void elUsuarioHaceClickEnAddToBasketButton() {
        HomePageServices.AddToBasketButton();
    }

    @And("el usuario puede ver el libro en el elemento del menú con el precio")
    public void elUsuarioPuedeVerElLibroEnElElementoDelMenuConElPrecio() {
        UtilToolsServices.AssertTrue(HomePageConstants.BasketItems);
    }

    @And("el usuario hace click en ViewBasketButton")
    public void elUsuarioHaceClickEnViewBasketButton() {
        HomePageServices.ViewBasketButton();
    }

    @And("el usuario puede encontrar los valores total y subtotal justo arriba del boton para proceder al Pago")
    public void elUsuarioPuedeEncontrarLosValoresTotalYSubtotalJustoArribaDelBotonParaProcederAlPago() {
        UtilToolsServices.AssertTrue(HomePageConstants.Values);
    }

    @And("el usuario hace click en ProceedToChekoutButton")
    public void elUsuarioHaceClickEnProceedToChekoutButton() {
        HomePageServices.ProceedToCheckoutButton();
    }

    @And("el usuario rellena los campos de detalles (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
    public void elUsuarioRellenaLosCamposDeDetalles(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {
        HomePageServices.DetailsField(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @Then("el usuario puede ver los detalles de facturacion, pedido y la opcion de usar cupon")
    public void elUsuarioPuedeVerLosDetallesDeFacturacionPedidoYLaOpcionDeUsarCupon() {
        UtilToolsServices.AssertTrue(HomePageConstants.DetallesDePago);
    }

    @And("el usuario hace click en PlaceOrderButton")
    public void elUsuarioHaceClickEnPlaceOrderButton() {
        UtilToolsServices.clickear(HomePageConstants.PlaceOrderButton);
    }

    @Then("el usuario puede ver los detalles de su compra")
    public void elUsuarioPuedeVerLosDetallesDeSuCompra() {
        UtilToolsServices.AssertTrue(HomePageConstants.DetallesDeCompra);
    }
}
