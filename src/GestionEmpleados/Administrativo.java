package GestionEmpleados;

public class Administrativo implements Empleado {
    private double salarioBase;

    public Administrativo(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String obtenerCargo() {
        return "Administrativo";
    }
}