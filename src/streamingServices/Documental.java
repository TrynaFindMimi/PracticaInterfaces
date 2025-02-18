package streamingServices;

public class Documental implements Reproducible {
    private String titulo;
    private String tema;

    public Documental(String titulo, String tema) {
        this.titulo = titulo;
        this.tema = tema;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el documental: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando el documental: " + titulo);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo el documental: " + titulo);
    }
    @Override
    public String getTitulo() {
        return titulo;
    }

    public String getTema() {
        return tema;
    }
}