package streamingServices;

public class Pelicula implements Reproducible {
    private String titulo;
    private int duracion;

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la película: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando la película: " + titulo);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la película: " + titulo);
    }
    @Override
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
}