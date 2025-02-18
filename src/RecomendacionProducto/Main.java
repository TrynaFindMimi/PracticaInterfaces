package RecomendacionProducto;

    public class Main {
        public static void main(String[] args) {

            Recomendable usuarioPremium = new UsuarioPremium();
            Recomendable usuarioRegular = new UsuarioRegular();

            SistemaRecomendaciones sistema = new SistemaRecomendaciones();

            sistema.mostrarRecomendaciones(usuarioPremium);
            sistema.mostrarRecomendaciones(usuarioRegular);
        }
    }
