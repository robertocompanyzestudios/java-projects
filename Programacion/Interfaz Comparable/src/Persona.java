public class Persona implements Comparable<Persona>{
    private String nombre;
    private int altura;
    private int edad;

    public Persona(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return ("\n" + this.getNombre() + " -> " +
                this.getAltura() + ", " +
                this.getEdad());
    }

    /*
    @Override
    public int compareTo(Persona o){
        int resultado = 0;
        if (this.getEdad() < o.getEdad()){
            return 1;
        } else if (this.getEdad() > o.getEdad()) {
            return -1;
        } else{
            return 0;
        }
    }
     */

    @Override
    public int compareTo(Persona o) {
        int resultado = 0;
        if (this.getAltura() < o.getAltura()){
            return 1;
        } else if (this.getAltura() > o.getAltura()) {
            return -1;
        } else{
            return 0;
        }
    }



}

