package co.com.walberto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.walberto.ui.Productos.TITULO_DESCRIPCION;

public class Descripcion implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return TITULO_DESCRIPCION.resolveFor(actor).isVisible();
    }

    public static Descripcion delCarritoCompra() {
        return new Descripcion();
    }

}
