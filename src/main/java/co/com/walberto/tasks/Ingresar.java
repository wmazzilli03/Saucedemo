package co.com.walberto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.walberto.ui.Login.*;
import static co.com.walberto.ui.Productos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar implements Task {

    private String usuario,password;

    public Ingresar(String usuario,String password){
        this.password =password;
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(INPUT_USERNAME),
                Type.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
        String tituloPagiProductos = TITLE_PRODUCTS.resolveFor(actor).getText();
        actor.remember("tituloPagina",tituloPagiProductos);

    }

    public static Performable misCredenciales(String usuario, String password) {
        return instrumented(Ingresar.class,usuario,password);

    }
}
