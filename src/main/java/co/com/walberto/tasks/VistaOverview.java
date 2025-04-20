package co.com.walberto.tasks;

import co.com.walberto.utils.Times;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.walberto.ui.Overview.BTN_FINISH;
import static co.com.walberto.utils.Constantes.TIME_SHORT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VistaOverview implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FINISH)
        );
        Times.waiting(TIME_SHORT);
    }

    public static Performable clicEnBtnFinalizar() {
        return instrumented(VistaOverview.class);
    }
}
