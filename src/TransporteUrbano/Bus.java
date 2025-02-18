package TransporteUrbano;

public class Bus implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Iniciando viaje en bus desde " + origen + " hasta " + destino);
    }

    @Override
    public double calcularTarifa() {
        System.out.println("Calculando tarifa del bus...");
        return 2.5;
    }
}