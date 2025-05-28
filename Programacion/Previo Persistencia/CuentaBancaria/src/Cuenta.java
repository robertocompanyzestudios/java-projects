public abstract class Cuenta {
    protected Cliente cliente;
    protected double saldo;
    protected double tipoInteresMensual;


    public boolean depositar(double cantidad) {
        if (cantidad > 0){
            saldo += cantidad;
            return true;
        }
        return false;
    }

    public abstract double calculoInteres(int meses);
}
