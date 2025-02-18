package PagoEmpresa;

public class FacturaFisica implements Facturable {
    private String idFactura;

    public FacturaFisica(String idFactura) {
        this.idFactura = idFactura;
    }

    @Override
    public void generarFactura() {
        System.out.println("Factura física generada: " + idFactura);
    }
}