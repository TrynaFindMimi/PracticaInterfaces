package AprendizajeOnline;

public class CursoPDF implements Curso {
    private String titulo;

    public CursoPDF(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando curso en PDF: " + titulo);
    }

    @Override
    public void completar() {
        System.out.println("Curso en PDF completado: " + titulo);
    }
}