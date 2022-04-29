package pa.com.serenity.main.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.serenity.main.tasks.BuscarNombreDeLaReunion;

public class VerificadoTituloDeLaReunion implements Question<Boolean> {

    private String informacion;

    public VerificadoTituloDeLaReunion(String informacion){ this.informacion = informacion; }
    public static VerificadoTituloDeLaReunion enElMenuReunion(String informacion) { return new VerificadoTituloDeLaReunion(informacion);}

    @Override
    public Boolean answeredBy(Actor actor) {

        return BuscarNombreDeLaReunion.NOMBRE_DEL_CURSO.resolveFor(actor).isPresent();
    }
}
