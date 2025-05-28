import java.math.BigInteger;

public class Cuenta {
    private static long proximacuenta = 1001;
    private long numCuenta;
    private long DNI;
    private Double saldo;

    //Constructors
    public Cuenta(long numCuenta, long DNI, Double saldo) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Cuenta(long DNI, double saldo) {
        this.numCuenta = proximacuenta;
        this.DNI = DNI;
        this.saldo = saldo;

        proximacuenta++;
    }

    //Getters and Setters
    public long getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDNI() {
        return DNI;
    }
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Metodos
    public void ingresar(double cantidad){
        if(cantidad<0){
            setSaldo(getSaldo() + cantidad);
        }

    }

    public void retirar(double cantidad){
        if ((getSaldo()-cantidad) > 0 && cantidad > 0){
            setSaldo(getSaldo() - cantidad);
        }
    }

    public String info(){
        return "Numero de cuenta: " + this.numCuenta + "\nDNI: " + this.DNI + "\nsaldo: " + this.saldo + "€\n";
    }

}
