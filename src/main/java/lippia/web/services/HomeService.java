package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;

import javax.swing.*;

public class HomeService extends ActionManager {
    public static void Shop_Button(){
        click(HomeConstants.Shop_Button);
    }

    public static void Home_Button(){
        click(HomeConstants.Home_Button);
    }

    public static void Slide_Button() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            //Thread.sleep(3000);
            TestServices.sleep(1000);
            click(HomeConstants.Slide_Button);
        }
    }

    public static void Javascript() {
        WebActionManager.isPresent(HomeConstants.JavaScript);
    }

    public static void HTML() {
        WebActionManager.isPresent(HomeConstants.HTML);
    }

    public static void Selenium_Ruby() {
        WebActionManager.isPresent(HomeConstants.Selenium_Ruby);
    }

    public static void Arrival1() {
        WebActionManager.isPresent(HomeConstants.Arrival1);
    }

    public static void Arrival2() {
        WebActionManager.isPresent(HomeConstants.Arrival2);
    }

    public static void Arrival3() {
        WebActionManager.isPresent(HomeConstants.Arrival3);
    }

    public static void Arrival_Image() {
        click(HomeConstants.Arrival_Image);
    }
}
