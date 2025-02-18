package TransporteUrbano;

public class BicicletaCompartida implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Iniciando viaje en bicicleta compartida desde " + origen + " hasta " + destino);
    }

    @Override
    public double calcularTarifa() {
        System.out.println("Calculando tarifa de la bicicleta compartida...");
        return 1.0;
    }
}
