package InventarioAlmacen;

public class Electronico implements Producto {
    private double precio;
    private int stock;

    public Electronico(double precio, int stock) {
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