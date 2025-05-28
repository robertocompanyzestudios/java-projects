package documentos;

public class Pedido {
    protected int cliente;
    protected String info;
    protected int id;

    public int getID(){
        return this.id;
    }


    static int pedidos = 1000;
    public static int getPedidos(){
        return pedidos;
    }


    public Pedido(int cliente, String info, int id) {
        this.cliente = cliente;
        this.info = info;
        this.id = id;

        pedidos+=1;
    }

    @Override
    public String toString() {
        return "\nPedido:" +
                "\nCliente: " + cliente +
                "\nInfo: " + info +
                "\nID: " + id;
    }
}
