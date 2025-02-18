package ReservasHoteles;

public class CasaVacacional implements Reservable {
    private String nombre;

    public CasaVacacional(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reservar(String fecha) {
        System.out.println("Reserva realizada en la casa vacacional " + nombre + " para la fecha: " + fecha);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada en la casa vacacional " + nombre);
    }
}
