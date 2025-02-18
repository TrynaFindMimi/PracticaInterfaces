package RecomendacionProducto;

import java.util.List;

public class SistemaRecomendaciones {
    public void mostrarRecomendaciones(Recomendable usuario) {
        List<Producto> recomendaciones = usuario.obtenerRecomendaciones();
        System.out.println("Recomendaciones para el usuario:");
        for (Producto producto : recomendaciones) {
            System.out.println(producto);
        }
    }
}