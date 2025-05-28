public class Hipoteca extends Cuenta{

    public Hipoteca(Cliente cliente, int tipoInteres) {
        this.cliente = cliente;
        this.saldo = 0;
        this.tipoInteresMensual = tipoInteres;
    }


    @Override
    public double calculoInteres(int meses) {
        if (cliente.getTipoCliente().toLowerCase().equals("particular")){
            if (meses <  6){
                return meses*((double) tipoInteresMensual/2);
            }else {
                return (6*((double) tipoInteresMensual/2)) + ((meses-6) * tipoInteresMensual);
            }

        }else if(cliente.getTipoCliente().toLowerCase().equals("empresa")){
            if (meses <  12){
                return meses*((double) tipoInteresMensual/2);
            }else {
                return (12*((double) tipoInteresMensual/2)) + ((meses-12) * tipoInteresMensual);
            }

        }
        return 0;
    }
}
