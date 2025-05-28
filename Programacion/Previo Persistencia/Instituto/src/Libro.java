import java.util.Date;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private Date anoPublicacion;
    private int isbn;

    //Constructors
    public Libro(String titulo, String autor, String editorial, Date anoPublicacion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;

    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(Date anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo=" + this.titulo +
                ", autor=" + this.autor +
                ", editorial=" + this.editorial +
                ", anoPublicacion=" + this.anoPublicacion +
                ", isbn=" + this.isbn +
                "}";
    }

    public String detalleLibro(){
        return "Libro{" +
                "titulo=" + this.titulo +
                ", autor=" + this.autor +
                ", editorial=" + this.editorial +
                ", anoPublicacion=" + this.anoPublicacion +
                ", isbn=" + this.isbn +
                "}";

    }





}
