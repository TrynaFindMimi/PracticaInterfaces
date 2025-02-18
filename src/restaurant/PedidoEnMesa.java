package restaurant;


public class PedidoEnMesa implements Pedido {
    private String idPedido;
    private int numeroMesa;

    public PedidoEnMesa(String idPedido, int numeroMesa) {
        this.idPedido = idPedido;
        this.numeroMesa = numeroMesa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido en mesa " + numeroMesa + ": " + idPedido);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido en mesa " + numeroMesa + ": " + idPedido);
    }
}