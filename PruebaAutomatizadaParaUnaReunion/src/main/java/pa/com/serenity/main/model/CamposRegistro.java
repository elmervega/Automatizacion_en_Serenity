package pa.com.serenity.main.model;

public class CamposRegistro {

    public String getUsuario() {
        return usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getNombre_unit() {
        return nombre_unit;
    }
    public String getSeleccion_paren_unit() {
        return seleccion_paren_unit;
    }
    public String getNombreReunion() {
        return nombreReunion;
    }
    public String getTipoDeReunion() {
        return tipoDeReunion;
    }
    public String getNumeroDeReunion() {
        return numeroDeReunion;
    }
    public String getUnit() {
        return unit;
    }
    public String getOrganizadaPor() {
        return organizadaPor;
    }
    public String getReportada() {
        return reportada;
    }
    public String getAsistiran() {
        return asistiran;
    }





    public CamposRegistro(String usuario, String contrasena, String nombre_unit, String seleccion_paren_unit,  String nombreReunion, String tipoDeReunion, String numeroDeReunion, String unit, String organizadaPor, String reportada, String asistiran) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre_unit = nombre_unit;
        this.seleccion_paren_unit = seleccion_paren_unit;
        this.nombreReunion = nombreReunion;
        this.tipoDeReunion = tipoDeReunion;
        this.numeroDeReunion = numeroDeReunion;
        this.unit = unit;
        this.organizadaPor = organizadaPor;
        this.reportada = reportada;
        this.asistiran = asistiran;

    }

    private final String usuario;
    private final String contrasena;
    private final String nombre_unit;
    private final String seleccion_paren_unit;
    private final String nombreReunion;
    private final String tipoDeReunion;
    private final String numeroDeReunion;
    private final String unit;
    private final String organizadaPor;
    private final String reportada;
    private final String asistiran;
}
