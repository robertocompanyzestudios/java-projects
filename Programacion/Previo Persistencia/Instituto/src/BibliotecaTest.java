import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    private Biblioteca biblioteca1;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;


    @BeforeEach
    public void generarObjetos(){
        //Crear biblioteca
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca UMU Merced");

        //Crear libros
        Libro libro1 = new Libro("Quijote", "Miguel de Cervantes" );
        Libro libro2 = new Libro("El Alquimista", "Paulo Cohelo" );
        Libro libro3 = new Libro("La Celestina", "Fernando de Rojas" );

        //Asignar libros a la biblioteca
        biblioteca1.anadirLibro(libro1);
        biblioteca1.anadirLibro(libro2);
        biblioteca1.anadirLibro(libro3);


    }



    @org.junit.jupiter.api.Test
    void anadirLibro() {

    }

    @org.junit.jupiter.api.Test
    void borrarLibro() {
    }

    @org.junit.jupiter.api.Test
    void filtrarAutor() {


    }
}