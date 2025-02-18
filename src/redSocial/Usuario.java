package redSocial;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void interactuarConPublicacion(Interactuable publicacion, String comentario, String tipoReaccion) {
        System.out.println(nombre + " está interactuando con la publicación:");
        publicacion.comentar(comentario);
        publicacion.reaccionar(tipoReaccion);
        publicacion.compartir();
    }
}