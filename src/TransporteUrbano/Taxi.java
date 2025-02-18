package TransporteUrbano;

public class Taxi implements TransportePublico {
    private Conductor conductor;

    public Taxi(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Iniciando viaje en taxi desde " + origen + " hasta " + destino);
        conductor.aceptarPasajero();
    }

    @Override
    public double calcularTarifa() {
        System.out.println("Calculando tarifa del taxi...");
        return 10.0; // Tarifa fija de ejemplo
    }

    public void finalizarViaje() {
        conductor.finalizarViaje();
        System.out.println("Viaje en taxi finalizado.");
    }
}