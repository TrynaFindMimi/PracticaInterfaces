package GestionEmpleados;

public class Gerente implements Empleado, Bonificable {
    private double salarioBase;
    private double bono;

    public Gerente(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBono();
    }

    @Override
    public String obtenerCargo() {
        return "Gerente";
    }

    @Override
    public double calcularBono() {
        return bono;
    }
}