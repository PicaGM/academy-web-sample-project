package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.AccountConstants;

public class AccountServices extends WebActionManager {
    public static void MyAccount_Details_Button() {
        UtilToolsServices.clickear(AccountConstants.MyAccount_Details_Button);
    }

    public static void MyAccount_Details() {
        isPresent(AccountConstants.MyAccount_Details);
    }
}
