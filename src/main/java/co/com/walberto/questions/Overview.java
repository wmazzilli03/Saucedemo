package co.com.walberto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.walberto.ui.Descripcion.TXT_CHECKOUT_OVERVIEW;

public class Overview implements Question<Boolean> {

    private String nombreVista;

    public Overview(String nombreVista){
        this.nombreVista =nombreVista;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String titulo = TXT_CHECKOUT_OVERVIEW.resolveFor(actor).getText();
        return titulo.equals(this.nombreVista);
    }

    public static Overview isVisible(String nombreVista) {
        return new Overview(nombreVista);
    }


}
