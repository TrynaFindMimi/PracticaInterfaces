package restaurant;

public class Ciclista implements Repartidor {
    @Override
    public void repartir(String idPedido) {
        System.out.println("Repartiendo pedido " + idPedido + " en bicicleta.");
    }
}