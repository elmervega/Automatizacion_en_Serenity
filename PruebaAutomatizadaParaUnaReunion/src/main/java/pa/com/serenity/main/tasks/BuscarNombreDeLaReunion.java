package pa.com.serenity.main.tasks;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarNombreDeLaReunion {

    public static final Target NOMBRE_DEL_CURSO = Target.the("Validando el nombre de la reunion")
            .locatedBy("//a[contains(.,'Informacion')]");
}
