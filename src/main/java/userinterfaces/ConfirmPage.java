package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPage {
    public static final Target Button_place_order = Target.the("Button place order").located(By.cssSelector("#page-wrapper > div > div.col-lg-1 > button"));

}
