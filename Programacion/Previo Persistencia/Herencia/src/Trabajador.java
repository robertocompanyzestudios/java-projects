public class Trabajador extends Persona implements Comparable<Trabajador>{
    private int salario;
    private int horasTrab;

    public Trabajador(String nombre, String apellidos, int salario, int horasTrab) {
        super(nombre, apellidos);
        this.salario = salario;
        this.horasTrab = horasTrab;
    }

    @Override
    public int compareTo(Trabajador o){
        if(this.salario < o.salario){
            return -1;
        } else if (this.salario > o.salario) {
            return 1;
        } else{
            return 0;
        }
 }

    @Override
    public String toString() {
        return super.toString() +
                " Salario:" + salario +
                ", HorasTrab:" + horasTrab;
    }
}


