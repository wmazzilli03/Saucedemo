package co.com.walberto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.walberto.ui.Descripcion.TXT_CHECKOUT;

public class VistaCheckOut implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_CHECKOUT.resolveFor(actor).isVisible();
    }

    public static VistaCheckOut verSubtituloCheckout(){
        return new VistaCheckOut();

    }
}
