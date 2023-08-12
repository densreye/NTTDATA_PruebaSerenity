package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class InventoryPage {
    public static final Target first_articule = Target.the("Choose a first articule").located(By.cssSelector("#tbodyid > div.row > div > a"));
    public static final Target second_articule = Target.the("Choose a second articule").located(By.cssSelector("#tbodyid > div.row > div > a"));

}
