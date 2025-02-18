package restaurant;

public class PedidoParaLlevar implements Pedido {
    private String idPedido;

    public PedidoParaLlevar(String idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para llevar: " + idPedido);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido para llevar: " + idPedido);
    }
}