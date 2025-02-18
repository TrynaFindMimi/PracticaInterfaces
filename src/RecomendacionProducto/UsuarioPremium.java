package RecomendacionProducto;

import java.util.ArrayList;
import java.util.List;

public class UsuarioPremium implements Recomendable {
    private List<Producto> historialCompras;

    public UsuarioPremium() {
        this.historialCompras = new ArrayList<>();
        historialCompras.add(new Producto("Laptop", "Electrónica", 1200.0));
        historialCompras.add(new Producto("Smartphone", "Electrónica", 800.0));
    }

    @Override
    public List<Producto> obtenerRecomendaciones() {
        List<Producto> recomendaciones = new ArrayList<>();

        recomendaciones.add(new Producto("Tablet", "Electrónica", 500.0));
        recomendaciones.add(new Producto("Auriculares", "Electrónica", 150.0));
        return recomendaciones;
    }
}