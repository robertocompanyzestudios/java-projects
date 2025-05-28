import documentos.*;

public class Main {
    public static void main(String[] args) {
        int pedidos = Pedido.getPedidos();
        Pedido pedido1 = new Pedido(1234, "4 paquetes de patatas", pedidos);
        Factura factura1 = new Factura(1234, pedido1, pedidos);

        pedidos = Pedido.getPedidos();
        Pedido pedido2 = new PedidoUrgente(4321, "26 sacos de café en grano", pedidos);
        Factura factura2 = new Factura(4321, pedido2, pedidos);


        System.out.println(pedido1);
        System.out.println(factura1);

        System.out.println(pedido2);
        System.out.println(factura2);

    }
}
