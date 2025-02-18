package ReservasHoteles;

public class Hotel implements Reservable, Calificable {
    private String nombre;
    private int estrellas;

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reservar(String fecha) {
        System.out.println("Reserva realizada en el hotel " + nombre + " para la fecha: " + fecha);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada en el hotel " + nombre);
    }

    @Override
    public void calificar(int estrellas) {
        this.estrellas = estrellas;
        System.out.println("Hotel " + nombre + " calificado con " + estrellas + " estrellas.");
    }
}
