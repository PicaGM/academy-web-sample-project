package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import jdk.incubator.vector.VectorOperators;
import lippia.web.constants.HomePageConstants;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.RegistrationConstants;

public class LoginServices extends WebActionManager {

    public static void My_Account() {
        UtilToolsServices.clickear(LoginConstants.My_Account);
    }

    public static void Login_Button() {
        UtilToolsServices.clickear(LoginConstants.Login_Button);
    }

    public static void Logout_Button() {
        UtilToolsServices.clickear(LoginConstants.Logout_Button);
    }

    public static void login (String username, String password) {
        setInput(LoginConstants.Username_Input_Locator, username);
        setInput(LoginConstants.Password_Input_Locator, password);
        UtilToolsServices.clickear(LoginConstants.Login_Button);
    }
}
