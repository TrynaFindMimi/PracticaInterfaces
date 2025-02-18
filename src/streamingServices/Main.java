package streamingServices;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Inception", 148);
        Serie serie = new Serie("Breaking Bad", 62);
        Documental documental = new Documental("Planet Earth", "Naturaleza");

        Usuario usuario = new Usuario("Juan");

        usuario.agregarFavorito(pelicula);
        usuario.agregarFavorito(serie);
        usuario.agregarFavorito(documental);

        usuario.reproducirFavorito("Inception");
        usuario.reproducirFavorito("Breaking Bad");
        usuario.reproducirFavorito("Planet Earth");
    }
}