public class Main {
    public static void main(String[] args) {
        Cliente clienteParticular = new Cliente("Particular");
        Cliente clienteEmpresa = new Cliente("Empresa");

        Deposito mideposito = new Deposito(clienteParticular, 0.8);

        mideposito.depositar(100.0);
        System.out.println(mideposito.saldo);
        System.out.println(mideposito.calculoInteres(13));
        


    }
}
