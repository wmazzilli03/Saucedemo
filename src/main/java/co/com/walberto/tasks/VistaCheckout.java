package co.com.walberto.tasks;
import co.com.walberto.ui.Checkout;
import co.com.walberto.utils.Times;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.walberto.utils.Constantes.TIME_SHORT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VistaCheckout implements Task {
    private String nombre,apellido,codigoPostal;
    private  List<Map<String, String>> datosCheckOut;
    private int id;

    public VistaCheckout(List<Map<String, String>> datosCheckOut,int id){
        this.datosCheckOut =datosCheckOut;
        this.id = id;
    }
    public VistaCheckout(String nombre,String apellido,String codigoPostal,int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal= codigoPostal;
        this.id = id;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(id == 1){
        actor.attemptsTo(
                Enter.theValue(this.nombre).into(Checkout.INPUT_FIRST_NAME),
                Enter.theValue(this.apellido).into(Checkout.INPUT_LAST_NAME),
                Enter.theValue(this.codigoPostal).into(Checkout.INPUT_ZIP_CODE),
                Click.on(Checkout.BTN_CONTINUAR)
                );
        }else {
            actor.attemptsTo(
                    Enter.theValue(datosCheckOut.get(0).get("nombre")).into(Checkout.INPUT_FIRST_NAME),
                    Enter.theValue(datosCheckOut.get(0).get("apellido")).into(Checkout.INPUT_LAST_NAME),
                    Enter.theValue(datosCheckOut.get(0).get("codigoPostal")).into(Checkout.INPUT_ZIP_CODE),
                    Click.on(Checkout.BTN_CONTINUAR)
            );
        }
        Times.waiting(TIME_SHORT);
    }
    public static Performable llenarFomulario(String nombre, String apellido, String codigoPostal) {
        return instrumented(VistaCheckout.class,nombre,apellido,codigoPostal,1);
    }

    public static Performable llenarFomularioPorUnMap(List<Map<String, String>> datosCheckOut) {
        return instrumented(VistaCheckout.class,datosCheckOut,2);
    }

}
