package co.com.walberto.tasks;

import co.com.walberto.ui.Productos;
import co.com.walberto.utils.DatosProducto;
import co.com.walberto.utils.Times;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static co.com.walberto.ui.Productos.BTN_ADD_CART;
import static co.com.walberto.ui.Productos.ICONO_CARRITO_COMPRA;
import static co.com.walberto.utils.Constantes.TIME_SHORT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    private String producto;
    private int number;

    public AgregarProducto(String producto, int number) {
        this.producto = producto;
        this.number = number;
        // this.producto = productoAzar;
    }
    public AgregarProducto(int number){
        this.number = number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (number) {
            case 1:
                actor.attemptsTo(
                        Click.on(Productos.botonAgregarProducto(this.producto)),
                        Click.on(BTN_ADD_CART),
                        Click.on(ICONO_CARRITO_COMPRA)
                );
                break;
            case 2:
                DatosProducto.obtenerProductoAleatorio(actor);
                actor.attemptsTo(
                        Click.on(ICONO_CARRITO_COMPRA)
                );
                break;
        }
        Times.waiting(TIME_SHORT);
    }

    public static Performable alCarritoCompra(String producto) {
        return instrumented(AgregarProducto.class, producto, 1);
    }

    public static Performable alAzarAlCarritoCompra(String producto) {
        return instrumented(AgregarProducto.class, producto, 1);
    }

    public static Performable aleatoriamente() {
        return instrumented(AgregarProducto.class, 2);

    }
}
