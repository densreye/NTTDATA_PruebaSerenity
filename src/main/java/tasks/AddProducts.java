package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static userinterfaces.HomePage.*;
import static userinterfaces.CartPage.*;
import static userinterfaces.FormPage.*;
import static userinterfaces.ConfirmPage.*;
import static userinterfaces.InventoryPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task{

    public AddProducts(){
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(choose_articule),
                Click.on(first_articule)


        );

        try {
            Thread.sleep(3000); // Espera de 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Click.on(choose_home),
                Click.on(choose_articule),
                Click.on(second_articule)


        );
        try {
            Thread.sleep(3000); // Espera de 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(View_cart),
                Click.on(Button_place_order),
                Enter.theValue("Dennys").into(Input_name),
                Enter.theValue("Ecuador").into(Input_country),
                Enter.theValue("Guayaquil").into(Input_city),
                Enter.theValue("123456").into(Input_credit_card),
                Enter.theValue("03").into(Input_month),
                Enter.theValue("26").into(Input_year),
                Click.on(button_purchase)

        );
    }

    public static AddProducts add() {
        return instrumented(AddProducts.class);
    }
}

