package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Pedido> pedidos;

    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado al sistema.");
    }

    public void procesarPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.preparar();
            pedido.entregar();
        }
    }
}