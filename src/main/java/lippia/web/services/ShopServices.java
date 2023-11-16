package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.testng.Assert;

public class ShopServices {

    public static void ShopButton() {
        UtilToolsServices.clickear(ShopConstants.ShopButton);
    }

    public static void AddToBasket() {
        UtilToolsServices.clickear(ShopConstants.AddToBasket);
    }

    public static void ViewBasket() {
        UtilToolsServices.clickear(ShopConstants.ViewBasket);
    }

    public static void Comparation() {
        boolean compare;
        String TotalPrice = WebActionManager.getText(ShopConstants.Total);
        TotalPrice = UtilToolsServices.borrarPrimerCaracter(TotalPrice);
        int total = UtilToolsServices.obtenerNumeroSinDecimales(TotalPrice);
        String SubTotalPrice = WebActionManager.getText(ShopConstants.SubTotal);
        SubTotalPrice = UtilToolsServices.borrarPrimerCaracter(SubTotalPrice);
        int subtotal = UtilToolsServices.obtenerNumeroSinDecimales(SubTotalPrice);
        Assert.assertNotEquals(total, subtotal);
        if(total > subtotal){
            compare = true;
        }else{
            compare = false;
        }
        Assert.assertTrue(compare);
    }

    public static void Percentage() {
        String subSubTotal = WebActionManager.getText(ShopConstants.SubTotal);
        subSubTotal = UtilToolsServices.borrarPrimerCaracter(subSubTotal);
        int subTotal = UtilToolsServices.obtenerNumeroSinDecimales(subSubTotal);
        int porcentaje = 2;
        int porcentajeTotal = 100;
        int result = (subTotal * porcentaje) / porcentajeTotal;
        String TaxPrice = WebActionManager.getText(ShopConstants.Tax);
        TaxPrice = UtilToolsServices.borrarPrimerCaracter(TaxPrice);
        Assert.assertEquals(result, UtilToolsServices.obtenerNumeroSinDecimales(TaxPrice));
        System.out.println(result);
    }
}
