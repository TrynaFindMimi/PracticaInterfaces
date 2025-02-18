package AprendizajeOnline;

public class CursoVideo implements Curso {
    private String titulo;

    public CursoVideo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando curso de video: " + titulo);
    }

    @Override
    public void completar() {
        System.out.println("Curso de video completado: " + titulo);
    }
}