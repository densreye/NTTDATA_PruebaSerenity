package userinterfaces;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {

    public static final Target Input_name = Target.the("Input name").located(By.id("name"));
    public static final Target Input_country = Target.the("Input country").located(By.id("country"));
    public static final Target Input_city = Target.the("Input city").located(By.id("city"));
    public static final Target Input_credit_card = Target.the("Input credit card").located(By.id("card"));
    public static final Target Input_month = Target.the("Input month").located(By.id("month"));
    public static final Target Input_year = Target.the("Input year").located(By.id("year"));
    public static final Target button_purchase = Target.the("Click purchase").located(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary"));

}
