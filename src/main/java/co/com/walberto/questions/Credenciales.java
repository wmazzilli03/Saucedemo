package co.com.walberto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.walberto.ui.Login.MSJ_USUARIO_O_PASSWORD_INCORRECTO;

public class Credenciales implements Question<Boolean> {

    private String msj;

    public Credenciales(String msj){
        this.msj = msj;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String tituloPagina2 = MSJ_USUARIO_O_PASSWORD_INCORRECTO.resolveFor(actor).getText();
        return  tituloPagina2.equals(this.msj);

    }

    public static Credenciales noSonCorrectas(String msj) {
        return new Credenciales(msj);
    }
}
