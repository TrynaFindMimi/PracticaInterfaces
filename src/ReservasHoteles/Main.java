package ReservasHoteles;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Plaza");
        Departamento departamento = new Departamento("Calle Falsa 123");
        CasaVacacional casaVacacional = new CasaVacacional("Casa del Sol");

        Usuario usuario = new Usuario("Juan");

        usuario.hacerReserva(hotel, "2023-12-25");
        usuario.hacerReserva(departamento, "2023-11-15");
        usuario.hacerReserva(casaVacacional, "2024-01-10");

        usuario.cancelarReserva(hotel);
        usuario.cancelarReserva(departamento);


        usuario.calificarHotel(hotel, 5);
    }
}