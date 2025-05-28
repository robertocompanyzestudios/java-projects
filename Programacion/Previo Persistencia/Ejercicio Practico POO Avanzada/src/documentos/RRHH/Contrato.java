package documentos.RRHH;

public class Contrato extends Documento{
    private String entidad;
    private String entidad2;

    public Contrato(String contenido, String entidad, String entidad2) {
        super(contenido);
        this.entidad = entidad;
        this.entidad2 = entidad2;
    }
}
