package redSocial;

public class Foto implements Interactuable {
    private String descripcion;

    public Foto(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en la foto '" + descripcion + "': " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción '" + tipoReaccion + "' en la foto '" + descripcion + "'");
    }

    @Override
    public void compartir() {
        System.out.println("Foto compartida: " + descripcion);
    }
}