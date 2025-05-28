package documentos;

public class Factura {
    int cliente;
    Pedido pedido;
    int id;

    public Factura(int cliente, Pedido pedido, int id) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nFactura:" +
                "\nCliente: " + cliente +
                "\nPedido: " + pedido.getID() +
                "\nID: " + id;
    }
}
