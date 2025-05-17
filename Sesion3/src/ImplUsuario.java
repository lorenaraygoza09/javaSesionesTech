public class ImplUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("Juanito Perez", 850.0);
        //accedemos al nombre
        System.out.println("Usuario: " + u.getNombre());
        //accedemos al saldo
        System.out.println("Saldo inicial: $" + u.getSaldo());
        //metodo publico para modificar saldo
        u.depositar(850.0);
        System.out.println("Saldo después del deposito: $" + u.getSaldo());
    }
}
