package restaurant;

public class Motorizado implements Repartidor {
    @Override
    public void repartir(String idPedido) {
        System.out.println("Repartiendo pedido " + idPedido + " en moto.");
    }
}