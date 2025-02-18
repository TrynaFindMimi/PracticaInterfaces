package restaurant;

public class PedidoDomicilio implements Pedido {
    private String idPedido;
    private Repartidor repartidor;

    public PedidoDomicilio(String idPedido, Repartidor repartidor) {
        this.idPedido = idPedido;
        this.repartidor = repartidor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido a domicilio: " + idPedido);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido a domicilio: " + idPedido);
        repartidor.repartir(idPedido);
    }
}