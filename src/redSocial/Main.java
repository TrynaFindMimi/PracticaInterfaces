package redSocial;

public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("Atardecer en la playa");
        Video video = new Video("Tutorial de Java");
        Articulo articulo = new Articulo("10 consejos para programar mejor");

        Usuario usuario = new Usuario("Juan");

        usuario.interactuarConPublicacion(foto, "¡Qué bonito!", "Me encanta");
        usuario.interactuarConPublicacion(video, "Muy útil, gracias", "Me gusta");
        usuario.interactuarConPublicacion(articulo, "Interesante", "Me gusta");
    }
}
