package ReservasHoteles;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void hacerReserva(Reservable reservable, String fecha) {
        System.out.println(nombre + " está realizando una reserva:");
        reservable.reservar(fecha);
    }

    public void cancelarReserva(Reservable reservable) {
        System.out.println(nombre + " está cancelando una reserva:");
        reservable.cancelarReserva();
    }

    public void calificarHotel(Hotel hotel, int estrellas) {
        System.out.println(nombre + " está calificando un hotel:");
        hotel.calificar(estrellas);
    }
}
