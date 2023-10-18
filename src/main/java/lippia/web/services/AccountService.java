package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.AccountConstants;

public class AccountService extends WebActionManager{
    public static void Dashboard() {
        waitClickable(AccountConstants.Dashboard);
    }

    public static void Orders() {
        click(AccountConstants.Orders);
    }
}
