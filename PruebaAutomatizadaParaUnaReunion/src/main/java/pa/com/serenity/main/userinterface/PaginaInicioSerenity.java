package pa.com.serenity.main.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioSerenity{

    public static final Target CAMPO_USUARIO = Target.the("Campo de Usuario")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target CAMPO_PASSWORD = Target.the("Campo de Contrasena")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BOTON_INICIAR_SESION = Target.the("Boton de iniciar sesion")
            .located(By.xpath("//button[contains(@id,'LoginButton')][@type='submit'][contains(.,'Sign In')]"));
    public static final Target SUBMENU_ORGANTIZATIONS = Target.the("Presionando en el subMenu de Organizacion")
            .located(By.xpath("//span[@class='s-sidebar-link-text'][contains(.,'Organization')]"));
    public static final Target PRESIONANDO_BUSINESS_UNITS = Target.the("Presionando en la opcion de Business Units")
            .located(By.xpath("//span[@class='s-sidebar-link-text'][contains(.,'Business Units')]"));
    public static final Target PRESIONANDO_BOTON_BUSINESS_UNITS = Target.the("Presionando el boton de Business Units")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'New Business Unit')]"));
    public static final Target LLENANDO_CAMPO_NAME = Target.the("Llenando el campo Name")
            .located(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public static final Target SELECCIONANDO_PARENT_UNIT = Target.the("Seleccionamos el Parent Unit")
            .located(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]"));
    public static final Target PARENT_UNIT_TECHNOLOGY = Target.the("Seleccionamos la opcion de Administration")
            .located(By.xpath("/html[1]/body[1]/div[7]/div[1]/input[1]"));
    public static final Target BOTON_DE_GUARDAR = Target.the("Salvamos")
            .located(By.xpath("(//span[contains(@class,'button-inner')])[4]"));
    public static final Target SUBMENU_REUNION = Target.the("Vamos al menu Reunion")
            .located(By.xpath("(//span[@class='s-sidebar-link-text'][contains(.,'Meeting')])[1]"));
    public static final Target CREAMOS_UNA_REUNION = Target.the("Presionamos al menu Reunion")
            .located(By.xpath("//span[@class='s-sidebar-link-text'][contains(.,'Meetings')]"));
    public static final Target PRESIONAMOS_NUEVA_REUNION = Target.the("Presionamos el boton en una nueva Reunion")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'New Meeting')]"));
    public static final Target NOMBRE_DE_LA_REUNION = Target.the("Ingresamos el nombre de la Reunion")
            .located(By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_MeetingName')]"));
    public static final Target TIPO_DE_REUNION = Target.the("Ingresamos el tipo de Reunion")
            .located(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/b[1]"));
    public static final Target EDITAR_TIPO_REUNION = Target.the("Fecha que inicia la Reunion")
            .located(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public static final Target BOTON_GUARDAR_TIPO_REUNION = Target.the("Boton de guardar tipo de Reunion")
            .located(By.xpath("(//span[@class='button-inner'][contains(.,'Save')])[2]"));
    public static final Target NUMERO_DE_REUNION = Target.the("Ingresamos el numero de la Reunion")
            .located(By.xpath("//input[contains(@id,'MeetingNumber')]"));
    public static final Target FECHA_INICIO = Target.the("Fecha que inicia la Reunion")
            .located(By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_StartDate')]"));
    public static final Target HORA_INICIO = Target.the("Hora que inicia la Reunion")
            .located(By.xpath("(//select[contains(@class,'editor s-DateTimeEditor time')])[1]"));
    public static final Target FECHA_FINAL = Target.the("Fecha final de la Reunion")
            .located(By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_EndDate')]"));
    public static final Target HORA_FINAL = Target.the("Hora final de la Reunion")
            .located(By.xpath("(//select[contains(@class,'editor s-DateTimeEditor time')])[2]"));
    public static final Target DEFINIR_LOCALIZACION = Target.the("Lugar de la Reunion")
            .located(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/b[1]"));
    public static final Target LUGAR_DE_LA_REUNION = Target.the("Definiendo el Lugar de la Reunion")
            .located(By.name("Name"));
    public static final Target BOTON_GUARDAR_REUNION = Target.the("Tipo Reunion")
            .located(By.xpath("(//span[@class='button-inner'][contains(.,'Save')])[2]"));
    public static final Target UNIT_REUNION = Target.the("Seleccionamos lo que creamos")
            .located(By.xpath("(//span[contains(@class,'select2-arrow')])[8]"));

    public static final Target UNIT_REUNION_UNIDAD1 = Target.the("Seleccionamos lo que creamos")
            .locatedBy("//div[starts-with(@id,'select2-result') and contains(text(),'$opcionUnidad1')]");

    public static final Target ORGANIZADA_DESPLEGAR = Target.the("Organizada la Reunion por")
            .located(By.xpath("(//span[@class='select2-chosen'])[9]"));

    public static final Target ORGANIZADA_POR = Target.the("Organizada la Reunion por")
            .locatedBy("//div[starts-with(@id,'select2-result') and contains(text(), '$organizadaPor')]");

    public static final Target REPORTADA_DESPLEGAR = Target.the("Click para desplegar Reportada")
            .located(By.xpath("(//span[@class='select2-chosen'])[10]"));

    public static final Target REPORTADA = Target.the("Reportada la Reunion")
            .locatedBy("//div[starts-with(@id,'select2-result') and contains(text(), '$reportadoPor')]");

    public static final Target ASISTIRAN_CAMPO = Target.the("Reportada la Reunion")
            .located(By.xpath("(//span[@class='select2-chosen'])[11]"));

    public static final Target ASISTIRAN = Target.the("Integrantes de la Reunion James Jones")
            .locatedBy("//div[starts-with(@id,'select2-result') and contains(text(), '$asistiran')]");

    public static final Target BOTON_GUARDAR = Target.the("Boton de guardar la Reunion")
            .locatedBy("//div[starts-with(@class, 'tool-button save-and-close-button icon-tool-button')]");

}
