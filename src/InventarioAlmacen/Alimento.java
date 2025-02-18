package InventarioAlmacen;
import java.time.LocalDate;

public class Alimento implements Producto, Almacenable {
    private double precio;
    private int stock;
    private LocalDate fechaCaducidad;

    public Alimento(double precio, int stock, LocalDate fechaCaducidad) {
        this.precio = precio;
        this.stock = stock;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public int obtenerStock() {
        return stock;
    }

    @Override
    public void guardarEnBodega() {
        if (fechaCaducidad.isAfter(LocalDate.now())) {
            System.out.println("Alimento guardado en bodega. Fecha de caducidad: " + fechaCaducidad);
        } else {
            System.out.println("El alimento está caducado y no puede ser guardado.");
        }
    }

    @Override
    public void retirarDeBodega() {
        System.out.println("Alimento retirado de la bodega.");
    }
}