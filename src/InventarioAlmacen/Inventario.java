package InventarioAlmacen;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario.");
    }

    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Producto producto : productos) {
            System.out.println("Precio: $" + producto.obtenerPrecio() + ", Stock: " + producto.obtenerStock());
        }
    }

    public void gestionarAlmacenamiento(Almacenable producto) {
        producto.guardarEnBodega();
        producto.retirarDeBodega();
    }
}
