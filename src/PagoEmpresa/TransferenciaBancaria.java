package PagoEmpresa;

public class TransferenciaBancaria implements MetodoPago {
    private String cuentaBancaria;

    public TransferenciaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con transferencia bancaria: " + cuentaBancaria);
    }
}