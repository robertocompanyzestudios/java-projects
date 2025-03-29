import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }


    public void nuevoPar(String palabraEsp, String palabraIng){
        this.diccionario.put(palabraEsp, palabraIng);
    }

    public String traduce(String palabraEsp){
        return (this.diccionario.get(palabraEsp));
    }

    public String palabraAleatoria(){
        Random random = new Random();

        int indice = random.nextInt(this.diccionario.keySet().size());
        String clave =(String) this.diccionario.keySet().toArray()[indice];

        return clave;
    }

    public char primeraLetraTraduccion(String palabraEsp){
        char letra = this.diccionario.get(palabraEsp).charAt(0);
        return letra;
    }

    public void generarDiccionario(String ruta){
        try{
            File fichero = new File(ruta);
            Scanner lector = new Scanner(fichero);

            while (lector.hasNextLine()){
                String[] dataSplitted = lector.nextLine().split(";");
                this.nuevoPar(dataSplitted[0], dataSplitted[1]);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
