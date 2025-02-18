package TransporteUrbano;

public class ConductorTaxi implements Conductor {
    @Override
    public void aceptarPasajero() {
        System.out.println("Conductor de taxi aceptó al pasajero.");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("Conductor de taxi finalizó el viaje.");
    }
}