package documentos.RRHH;

public class CV extends Documento{
    private String titular;
    private String email;
    private int numtel;
    private int edad;

    public CV(String contenido, String titular, String email, int numtel, int edad) {
        super(contenido);
        this.titular = titular;
        this.email = email;
        this.numtel = numtel;
        this.edad = edad;
    }
}
