public class Sistema {
    public static void main(String[] args) {
    NotificacionEmail email = new NotificacionEmail("Tu pedido ha sido enviado", "hola@gmail.com");
    email.enviar(); //metodo heredado
    email.enviarEmail(); //metodo propio
    }
}