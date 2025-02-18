package PagoEmpresa;

public class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con tarjeta de crédito: " + numeroTarjeta);
    }
}