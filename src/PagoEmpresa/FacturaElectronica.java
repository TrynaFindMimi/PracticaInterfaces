package PagoEmpresa;

public class FacturaElectronica implements Facturable {
    private String idFactura;

    public FacturaElectronica(String idFactura) {
        this.idFactura = idFactura;
    }

    @Override
    public void generarFactura() {
        System.out.println("Factura electrónica generada: " + idFactura);
    }
}