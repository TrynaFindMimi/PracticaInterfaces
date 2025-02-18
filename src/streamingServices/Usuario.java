package streamingServices;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Reproducible> favoritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.favoritos = new ArrayList<>();
    }

    public void agregarFavorito(Reproducible contenido) {
        favoritos.add(contenido);
        System.out.println(contenido.getTitulo() + " ha sido agregado a los favoritos de " + nombre);
    }

    public void reproducirFavorito(String titulo) {
        for (Reproducible contenido : favoritos) {
            if (contenido.getTitulo().equals(titulo)) {
                contenido.reproducir();
                return;
            }
        }
        System.out.println("No se encontró " + titulo + " en los favoritos de " + nombre);
    }
}