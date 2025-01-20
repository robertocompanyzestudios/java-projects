import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    //Constructors
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    //Metodos
    public void anadirLibro(Libro libro){
        libros.add(libro);
    }

    public void borrarLibro(Libro libro){
        for(Libro i: libros){
            if(i.equals(libro)){
                libros.remove(libro);
            }
        }
    }

    public void borrarLibro(String nombre){
        Libro libro = null;
        for(Libro i: libros){
            if(i.getTitulo().equals(nombre)){
                libro = i;
            }
        }
        libros.remove(libro);
    }

    //recibe 1 autor y devuelve un array con todos los objetos de tipo Libro() de ese autor
    public Libro[] filtrarAutor(String autor){
        int contador = 0;

        for(Libro i: libros){
            if(i.getAutor().equalsIgnoreCase(autor)){
                contador = contador + 1;
            }
        }

        Libro[] Coincidencias = new Libro[contador];
        contador = 0;

        for(Libro i: libros){
            if(i.getAutor().equalsIgnoreCase(autor)){
                Coincidencias[contador] = i;
                contador++;
            }
        }
        return Coincidencias;
    }


}
