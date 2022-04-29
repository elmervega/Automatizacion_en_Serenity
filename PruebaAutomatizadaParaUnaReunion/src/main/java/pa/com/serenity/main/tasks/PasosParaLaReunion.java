package pa.com.serenity.main.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import pa.com.serenity.main.model.CamposRegistro;
import pa.com.serenity.main.userinterface.PaginaInicioSerenity;

public class PasosParaLaReunion implements Task {

    private CamposRegistro camposRegistro;

    public PasosParaLaReunion(CamposRegistro camposRegistro){ this.camposRegistro = camposRegistro; }

    public static PasosParaLaReunion iniciandoSesion(CamposRegistro camposRegistro) {
        return Tasks.instrumented(PasosParaLaReunion.class, camposRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(camposRegistro.getUsuario()).into(PaginaInicioSerenity.CAMPO_USUARIO),
                Enter.theValue(camposRegistro.getContrasena()).into(PaginaInicioSerenity.CAMPO_PASSWORD),
                Click.on(PaginaInicioSerenity.BOTON_INICIAR_SESION),
                Click.on(PaginaInicioSerenity.SUBMENU_ORGANTIZATIONS),
                Click.on(PaginaInicioSerenity.PRESIONANDO_BUSINESS_UNITS),
                Click.on(PaginaInicioSerenity.PRESIONANDO_BOTON_BUSINESS_UNITS),
                Enter.theValue(camposRegistro.getNombre_unit()).into(PaginaInicioSerenity.LLENANDO_CAMPO_NAME),
                MoveMouse.to(PaginaInicioSerenity.SELECCIONANDO_PARENT_UNIT).andThen(actions -> actions.click()),
                Enter.theValue(camposRegistro.getSeleccion_paren_unit()).into(PaginaInicioSerenity.PARENT_UNIT_TECHNOLOGY),
                JavaScriptClick.on(PaginaInicioSerenity.BOTON_DE_GUARDAR),
                Click.on(PaginaInicioSerenity.SUBMENU_REUNION),
                Click.on(PaginaInicioSerenity.CREAMOS_UNA_REUNION),
                Click.on(PaginaInicioSerenity.PRESIONAMOS_NUEVA_REUNION),
                Enter.theValue(camposRegistro.getNombreReunion()).into(PaginaInicioSerenity.NOMBRE_DE_LA_REUNION),
                JavaScriptClick.on(PaginaInicioSerenity.TIPO_DE_REUNION),
                Enter.theValue(camposRegistro.getTipoDeReunion()).into(PaginaInicioSerenity.EDITAR_TIPO_REUNION),
                JavaScriptClick.on(PaginaInicioSerenity.BOTON_GUARDAR_TIPO_REUNION),
                Enter.theValue(camposRegistro.getNumeroDeReunion()).into(PaginaInicioSerenity.NUMERO_DE_REUNION),
                Enter.theValue("04/28/2022").into(PaginaInicioSerenity.FECHA_INICIO),
                SelectFromOptions.byIndex(1).from(PaginaInicioSerenity.HORA_INICIO),
                Enter.theValue("04/30/2022").into(PaginaInicioSerenity.FECHA_FINAL),
                JavaScriptClick.on(PaginaInicioSerenity.HORA_FINAL),
                SelectFromOptions.byVisibleText("10:50").from(PaginaInicioSerenity.HORA_FINAL),
                Click.on(PaginaInicioSerenity.DEFINIR_LOCALIZACION),
                Enter.theValue("Panama").into(PaginaInicioSerenity.LUGAR_DE_LA_REUNION),
                JavaScriptClick.on(PaginaInicioSerenity.BOTON_GUARDAR_REUNION),
                Click.on(PaginaInicioSerenity.UNIT_REUNION),
                Click.on(PaginaInicioSerenity.UNIT_REUNION_UNIDAD1.getCssOrXPathSelector().replace("$opcionUnidad1", camposRegistro.getUnit())),
                Click.on(PaginaInicioSerenity.ORGANIZADA_DESPLEGAR),
                Click.on(PaginaInicioSerenity.ORGANIZADA_POR.getCssOrXPathSelector().replace("$organizadaPor", camposRegistro.getOrganizadaPor())),
                Click.on(PaginaInicioSerenity.REPORTADA_DESPLEGAR),
                Click.on(PaginaInicioSerenity.REPORTADA.getCssOrXPathSelector().replace("$reportadoPor", camposRegistro.getReportada())),
                Click.on(PaginaInicioSerenity.ASISTIRAN_CAMPO),
                Click.on(PaginaInicioSerenity.ASISTIRAN.getCssOrXPathSelector().replace("$asistiran", camposRegistro.getAsistiran())),
                Click.on(PaginaInicioSerenity.BOTON_GUARDAR)

        );
    }
}
