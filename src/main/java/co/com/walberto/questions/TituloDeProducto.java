package co.com.walberto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;

public class TituloDeProducto implements Question<Boolean>{



    @Override
    public Boolean answeredBy(Actor actor) {
        String textoGuardado = actor.recall("tituloPagina");
        return textoGuardado.equals("Swag Labs");
    }

    public static TituloDeProducto esVisible() {
        return new TituloDeProducto();
    }
}
