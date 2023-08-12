package userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePage extends PageObject{
    public static final Target choose_articule = Target.the("Choose articule").located(By.cssSelector("#tbodyid > div:nth-child(1) > div > a > img"));

    public static final Target choose_home = Target.the("Choose home").located(By.cssSelector("#navbarExample > ul > li.nav-item.active > a"));

}