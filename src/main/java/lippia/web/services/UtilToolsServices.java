package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UtilToolsServices extends WebActionManager {
    public static void miScroll(String element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }
    public static void scrollTo (String xpath){
        JavascriptExecutor javascriptExecutor = DriverManager.getDriverInstance();
        WebElement element = WebActionManager.getElement(xpath);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void sleep (long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException var4) {
            System.out.println("Error in sleep: ".concat(var4.getMessage()));
            var4.printStackTrace();
        }
    }

    public static void AssertTrue(String locator) {
        boolean AssertTrue = WebActionManager.isVisible(locator);
        Assert.assertTrue(AssertTrue);
    }

    public static void clickear(String locatorElement, String... locatorReplacementValue) {
        click(locatorElement, false, locatorReplacementValue);
    }

    public static void verifyCurrentUrl(String expectedUrl) {
        String currentUrl = DriverManager.getDriverInstance().getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);
    }

    public static String borrarPrimerCaracter(String input) {
        if (input != null && input.length() > 0) {
            return input.substring(1);
        } else {
            System.out.println("La cadena es nula o vacía.");
            return input;
        }
    }

    public static int obtenerNumeroSinDecimales(String input) {
        if (input != null && input.contains(".")) {
            int indicePunto = input.indexOf(".");
            String parteEntera = input.substring(0, indicePunto);
            return Integer.parseInt(parteEntera);
        } else {
            System.out.println("La cadena no contiene un punto.");
            return 0;
        }
    }
}
