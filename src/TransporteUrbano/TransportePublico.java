package TransporteUrbano;

public interface TransportePublico {
    void iniciarViaje(String origen, String destino);
    double calcularTarifa();
}
