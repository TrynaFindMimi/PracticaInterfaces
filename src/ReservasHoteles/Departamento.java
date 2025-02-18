package ReservasHoteles;

public class Departamento implements Reservable {
    private String ubicacion;

    public Departamento(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void reservar(String fecha) {
        System.out.println("Reserva realizada en el departamento ubicado en " + ubicacion + " para la fecha: " + fecha);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada en el departamento ubicado en " + ubicacion);
    }
}