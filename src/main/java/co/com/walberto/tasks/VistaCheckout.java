package co.com.walberto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VistaCheckout implements Task {
    private String nombre,apellido;
    private  int codigoPostal;

    public VistaCheckout(String nombre,String apellido,int codigoPostal){
        this.nombre = nombre;
        this.apellido = nombre;
        this.codigoPostal= codigoPostal;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static Performable llenarFomulario(String nombre, String apellido, int codigoPostal) {
        return instrumented(VistaCheckout.class,nombre,apellido,codigoPostal);
    }

}
