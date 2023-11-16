package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.RegistrationConstants;

import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.click;

public class RegistrationServices extends WebActionManager {
    public static void register(String mail, String password) {
        setInput(RegistrationConstants.User_Input, mail);
        setInput(RegistrationConstants.Pass_Input, password);
        UtilToolsServices.clickear(RegistrationConstants.Register_Button);
    }
}
