package PagoEmpresa;

public class Compra {
    private MetodoPago metodoPago;
    private Facturable factura;

    public Compra(MetodoPago metodoPago, Facturable factura) {
        this.metodoPago = metodoPago;
        this.factura = factura;
    }

    public void realizarCompra(double monto) {
        metodoPago.procesarPago(monto);
        factura.generarFactura();
    }
}