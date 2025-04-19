package co.com.walberto.tasks;

import co.com.walberto.ui.Productos;
import co.com.walberto.utils.Times;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.walberto.utils.Constantes.TIME_SHORT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    private String producto;

    public AgregarProducto( String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Productos.botonAgregarProducto(this.producto))
        );
        Times.waiting(TIME_SHORT);
    }

    public static Performable alCarritoCompra(String producto) {
            return instrumented(AgregarProducto.class,producto);
    }
}
