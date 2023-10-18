package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Objects;

public class TestServices extends WebActionManager {
    public static void miScroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    public static void scrollTo(String xpath){
        JavascriptExecutor javascriptExecutor = DriverManager.getDriverInstance();
        WebElement element = WebActionManager.getElement(xpath);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void login(String username, String password) {
        setInput(LoginConstants.Username_Input_Locator, username);
        setInput(LoginConstants.Password_Input_Locator, password);
        click(LoginConstants.Login_Button);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException var4) {
            System.out.println("Error in sleep: ".concat(var4.getMessage()));
            var4.printStackTrace();
        }
    }
}