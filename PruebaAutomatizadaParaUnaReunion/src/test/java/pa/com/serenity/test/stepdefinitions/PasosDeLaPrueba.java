package pa.com.serenity.test.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.serenity.main.model.CamposRegistro;
import pa.com.serenity.main.questions.VerificadoTituloDeLaReunion;
import pa.com.serenity.main.tasks.AbrirPagina;
import pa.com.serenity.main.tasks.PasosParaLaReunion;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PasosDeLaPrueba {

    @Before
    public void setStage() {setTheStage(new OnlineCast());}

    @Given("^que tengo el usuario y la contrasena para entrar a la pagina$")
    public void queTengoElUsuarioYLaContrasenaParaEntrarALaPagina() {
        theActor("Elmer").wasAbleTo(AbrirPagina.abriendoPaginaSerenity());
    }


    @When("^inicio la sesion ire al menu de organzacion y creare una nueva reunion$")
    public void inicioLaSesionIreAlMenuDeOrganzacionYCreareUnaNuevaReunion(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        CamposRegistro camposRegistro = new CamposRegistro(rows.get(1).get(0), rows.get(1).get(1), rows.get(1).get(2),rows.get(1).get(3),rows.get(1).get(4),rows.get(1).get(5),rows.get(1).get(6),rows.get(1).get(7),rows.get(1).get(8),rows.get(1).get(9),rows.get(1).get(10));
        theActorInTheSpotlight().attemptsTo(PasosParaLaReunion.iniciandoSesion(camposRegistro));
    }

    @Then("^verifico que he realizado la creacion de esta reunion con el nombre (.*)\\.$")
    public void verificoQueHeRealizadoLaCreacionDeEstaReunionConElNombreinformacion( String informacion) {
        theActorInTheSpotlight().should(seeThat(VerificadoTituloDeLaReunion.enElMenuReunion(informacion)));
    }
}
