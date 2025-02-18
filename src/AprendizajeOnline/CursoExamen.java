package AprendizajeOnline;

public class CursoExamen implements Curso, Evaluable {
    private String titulo;

    public CursoExamen(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando examen: " + titulo);
    }

    @Override
    public void completar() {
        System.out.println("Examen completado: " + titulo);
    }

    @Override
    public void calificar(int puntaje) {
        System.out.println("Examen '" + titulo + "' calificado con " + puntaje + " puntos.");
    }
}
