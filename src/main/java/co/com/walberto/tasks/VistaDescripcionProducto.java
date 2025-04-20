package co.com.walberto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.walberto.ui.Descripcion.BTN_CHECKOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VistaDescripcionProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHECKOUT)
        );

    }

    public static Performable alPresionarClick() {
        return instrumented(VistaDescripcionProducto.class);
    }



}
