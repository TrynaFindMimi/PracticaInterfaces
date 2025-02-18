package GestionEmpleados;

public class Main {
    public static void main(String[] args) {
        Empleado administrativo = new Administrativo(2000.0);
        Empleado tecnico = new Tecnico(2500.0, 10);
        Empleado gerente = new Gerente(5000.0, 1000.0);

        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(administrativo);
        empresa.agregarEmpleado(tecnico);
        empresa.agregarEmpleado(gerente);

        empresa.mostrarSalarios();
    }
}
