package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;
import tasks.*;
import userinterfaces.HomePage;
import userinterfaces.InventoryPage;


public class PurchaseSteps {
    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("Dennys");
    private HomePage homePage = new HomePage();
    private InventoryPage inventoryPage = new InventoryPage();

    @Given("^que el usuario se encuentra en la página de inicio demoblaze$")
    public void queElUsuarioSeEncuentraEnLaPáginaDeInicioDemoblaze() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @When("^el usuario agrega dos productos al carrito, visualiza el carrito y completa el formulario de compra$")
    public void elUsuarioAgregaDosProductosAlCarrito() {
        actor.wasAbleTo(
                AddProducts.add()
        );
    }

    @Then("^se realiza con éxito la compra y se muestra el mensaje \"([^\"]*)\"$")
    public void SeRealizaConÉxitoLaCompraYSeMuestraElMensaje(String arg1) {
        String mensaje_ok = "Thank you for your purchase!";
        mensaje_ok.equals(arg1);
    }
}