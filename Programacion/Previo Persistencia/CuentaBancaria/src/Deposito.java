public class Deposito extends Cuenta{


    public Deposito(Cliente cliente, double tipoInteres) {
        this.cliente = cliente;
        this.saldo = 0;
        this.tipoInteresMensual = tipoInteres;
    }

    private boolean comprobarDescuento(){
        if (saldo < 1000){
            return true;
        } else {
            return false;
        }
    }


    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo-cantidad > 0.0){
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public double calculoInteres(int meses) {
        if (comprobarDescuento()){
            return meses* tipoInteresMensual;
        } else {
            return 0.0;
        }

    }
}
