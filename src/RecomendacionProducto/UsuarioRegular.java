package RecomendacionProducto;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRegular implements Recomendable {
    private List<Producto> historialBusquedas;

    public UsuarioRegular() {
        this.historialBusquedas = new ArrayList<>();
        historialBusquedas.add(new Producto("Libro", "Literatura", 20.0));
        historialBusquedas.add(new Producto("Mochila", "Accesorios", 50.0));
    }

    @Override
    public List<Producto> obtenerRecomendaciones() {
        List<Producto> recomendaciones = new ArrayList<>();

        recomendaciones.add(new Producto("Cuaderno", "Papelería", 10.0));
        recomendaciones.add(new Producto("Bolígrafo", "Papelería", 2.0));
        return recomendaciones;
    }
}