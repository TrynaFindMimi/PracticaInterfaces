package PagoEmpresa;

public class PayPal implements MetodoPago {
    private String correo;

    public PayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con PayPal: " + correo);
    }
}