package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService extends WebActionManager{

    public static void My_Account() {
        click(LoginConstants.My_Account);
    }

    public static void Login_Button() {
        click(LoginConstants.Login_Button);
    }


}
