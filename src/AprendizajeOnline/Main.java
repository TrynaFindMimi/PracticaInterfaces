package AprendizajeOnline;

public class Main {
    public static void main(String[] args) {
        Curso cursoVideo = new CursoVideo("Introducción a Java");
        Curso cursoPDF = new CursoPDF("Diseño de Interfaces");
        CursoExamen cursoExamen = new CursoExamen("Examen Final de Programación");

        Estudiante estudiante = new Estudiante("Juan");

        estudiante.inscribirseEnCurso(cursoVideo);
        estudiante.completarCurso(cursoVideo);

        estudiante.inscribirseEnCurso(cursoPDF);
        estudiante.completarCurso(cursoPDF);

        estudiante.inscribirseEnCurso(cursoExamen);
        estudiante.completarCurso(cursoExamen);
        estudiante.calificarExamen(cursoExamen, 95);
    }
}
