package GestionEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.obtenerCargo());
    }

    public void mostrarSalarios() {
        System.out.println("Salarios de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.obtenerCargo() + ": $" + empleado.calcularSalario());
        }
    }
}
