package AprendizajeOnline;

public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirseEnCurso(Curso curso) {
        System.out.println(nombre + " se ha inscrito en un curso.");
        curso.iniciar();
    }

    public void completarCurso(Curso curso) {
        System.out.println(nombre + " ha completado un curso.");
        curso.completar();
    }

    public void calificarExamen(CursoExamen examen, int puntaje) {
        System.out.println(nombre + " ha calificado un examen.");
        examen.calificar(puntaje);
    }
}
