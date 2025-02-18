package GestionEmpleados;

public class Tecnico implements Empleado {
    private double salarioBase;
    private int horasExtras;

    public Tecnico(double salarioBase, int horasExtras) {
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 20); // $20 por hora extra
    }

    @Override
    public String obtenerCargo() {
        return "Técnico";
    }
}