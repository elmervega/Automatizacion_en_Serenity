package pa.com.serenity.main.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.serenity.main.userinterface.AbriendoPagina;

public class AbrirPagina implements Task {

    private AbriendoPagina abriendoPagina;

    public static AbrirPagina abriendoPaginaSerenity() { return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(abriendoPagina)
        );
    }
}
