package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomePageConstants;
import org.testng.Assert;

public class HomePageServices {

    public static void Arrival_Image() {
        UtilToolsServices.clickear(HomePageConstants.Arrival_Image);
    }

    public static void AddToBasketButton() {
        UtilToolsServices.clickear(HomePageConstants.AddToBasketButton);
    }

    public static void ViewBasketButton() {
        UtilToolsServices.clickear((HomePageConstants.ViewBasketButton));
    }

    public static void ProceedToCheckoutButton() {
        UtilToolsServices.clickear(HomePageConstants.ProceedToCheckoutButton);
    }

    public static void DetailsField(String FirstName, String LastName, String EmailAddress, String Phone, String Country, String Address, String TownDistrict, String Region, String Postcode) {
        ActionManager.setInput(HomePageConstants.NameTextbox, FirstName);
        ActionManager.setInput(HomePageConstants.LastNameTextbox, LastName);
        ActionManager.setInput(HomePageConstants.EmailTextbox, EmailAddress);
        ActionManager.setInput(HomePageConstants.PhoneTextbox, Phone);
        UtilToolsServices.clickear(HomePageConstants.CountryDropButton);
        ActionManager.setInput(HomePageConstants.CountryTextbox, Country);
        UtilToolsServices.clickear(HomePageConstants.FirstSelection);
        ActionManager.setInput(HomePageConstants.AdressTextbox, Address);
        ActionManager.setInput(HomePageConstants.TownCityTextbox, TownDistrict);
        UtilToolsServices.clickear(HomePageConstants.StateDropButton);
        ActionManager.setInput(HomePageConstants.StateTextbox, Region);
        UtilToolsServices.clickear(HomePageConstants.FirstOption);
        ActionManager.setInput(HomePageConstants.PostcodeTextbox, Postcode);
        UtilToolsServices.clickear(HomePageConstants.DirectBankTransfer);
    }
}
