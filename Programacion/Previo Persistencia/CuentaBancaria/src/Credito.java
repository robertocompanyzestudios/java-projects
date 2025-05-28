public class Credito extends Cuenta{

    public Credito(Cliente cliente, double tipoInteres) {
        this.cliente = cliente;
        this.saldo = 0;
        this.tipoInteresMensual = tipoInteres;
    }




    @Override
    public double calculoInteres(int meses) {
        if (cliente.getTipoCliente().toLowerCase().equals("particular")){
            meses -= 3;
            if (meses < 0){
                return 0.0;
            }
            return meses * tipoInteresMensual;

        }else if(cliente.getTipoCliente().toLowerCase().equals("empresa")){
            meses -= 2;
            if (meses < 0){
                return 0.0;
            }
            return meses * tipoInteresMensual;

        }
        return 0;
    }
}
