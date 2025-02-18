package TransporteUrbano;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarViaje(TransportePublico transporte, String origen, String destino) {
        System.out.println(nombre + " está solicitando un viaje:");
        transporte.iniciarViaje(origen, destino);
        double tarifa = transporte.calcularTarifa();
        System.out.println("Tarifa calculada: $" + tarifa);

        if (transporte instanceof Taxi) {
            ((Taxi) transporte).finalizarViaje();
        }
    }
}
