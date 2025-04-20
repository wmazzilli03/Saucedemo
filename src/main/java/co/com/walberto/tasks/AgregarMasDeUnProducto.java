package co.com.walberto.tasks;

import co.com.walberto.utils.DatosProducto;
import co.com.walberto.utils.Times;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.walberto.ui.Productos.ICONO_CARRITO_COMPRA;
import static co.com.walberto.utils.Constantes.TIME_SHORT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarMasDeUnProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosProducto.obtenerProductoAleatorio(actor);
        actor.attemptsTo(
                Click.on(ICONO_CARRITO_COMPRA)
        );
        Times.waiting(TIME_SHORT);
    }

    public static Performable aleatoriamente() {
        return instrumented(AgregarMasDeUnProducto.class);
    }
}
