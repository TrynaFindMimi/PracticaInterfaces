package PagoEmpresa;

public class Main {
    public static void main(String[] args) {

        MetodoPago tarjetaCredito = new TarjetaCredito("1234-5678-9012-3456");
        MetodoPago paypal = new PayPal("usuario@example.com");
        MetodoPago transferenciaBancaria = new TransferenciaBancaria("ES1234567890123456789012");

        Facturable facturaElectronica = new FacturaElectronica("FAC-001");
        Facturable facturaFisica = new FacturaFisica("FAC-002");
        Compra compra1 = new Compra(tarjetaCredito, facturaElectronica);
        compra1.realizarCompra(150.0);

        Compra compra2 = new Compra(paypal, facturaFisica);
        compra2.realizarCompra(75.0);

        Compra compra3 = new Compra(transferenciaBancaria, facturaElectronica);
        compra3.realizarCompra(200.0);
    }
}
