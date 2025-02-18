package InventarioAlmacen;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto electronico = new Electronico(299.99, 50);
        Producto alimento = new Alimento(5.99, 100, LocalDate.of(2023, 12, 31));
        Producto ropa = new Ropa(19.99, 200);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(electronico);
        inventario.agregarProducto(alimento);
        inventario.agregarProducto(ropa);

        inventario.mostrarInventario();

        if (alimento instanceof Almacenable) {
            inventario.gestionarAlmacenamiento((Almacenable) alimento);
        }
    }
}