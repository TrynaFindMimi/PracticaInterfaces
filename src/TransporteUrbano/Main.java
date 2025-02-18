package TransporteUrbano;

public class Main {
    public static void main(String[] args) {
        Conductor conductorTaxi = new ConductorTaxi();

        TransportePublico taxi = new Taxi(conductorTaxi);
        TransportePublico bus = new Bus();
        TransportePublico bicicleta = new BicicletaCompartida();

        Usuario usuario = new Usuario("Juan");

        usuario.solicitarViaje(taxi, "Calle 123", "Avenida Principal");
        usuario.solicitarViaje(bus, "Parque Central", "Estación Norte");
        usuario.solicitarViaje(bicicleta, "Plaza Mayor", "Mercado Central");
    }
}
