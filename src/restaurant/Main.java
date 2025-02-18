package restaurant;

public class Main {
    public static void main(String[] args) {

        Repartidor motorizado = new Motorizado();
        Repartidor ciclista = new Ciclista();


        Pedido pedidoLlevar = new PedidoParaLlevar("P001");
        Pedido pedidoMesa = new PedidoEnMesa("P002", 5);
        Pedido pedidoDomicilio1 = new PedidoDomicilio("P003", motorizado);
        Pedido pedidoDomicilio2 = new PedidoDomicilio("P004", ciclista);

        Restaurante restaurante = new Restaurante();
        restaurante.agregarPedido(pedidoLlevar);
        restaurante.agregarPedido(pedidoMesa);
        restaurante.agregarPedido(pedidoDomicilio1);
        restaurante.agregarPedido(pedidoDomicilio2);

        restaurante.procesarPedidos();
    }
}