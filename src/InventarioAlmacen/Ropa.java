package InventarioAlmacen;

public class Ropa implements Producto {
    private double precio;
    private int stock;

    public Ropa(double precio, int stock) {
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public int obtenerStock() {
        return stock;
    }
}