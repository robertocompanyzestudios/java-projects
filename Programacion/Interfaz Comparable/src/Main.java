import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Antonio", 172, 17));
        personas.add(new Persona("Hugo", 177, 20));
        personas.add(new Persona("Samuel", 170, 24));

        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);

    }
}
