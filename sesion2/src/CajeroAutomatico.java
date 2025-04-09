import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("""
                Bienvenido al cajero automático
                1. Consultar saldo
                2. Depositar dinero
                3. Retirar dinero
                4. Salir
                """);
        int respuestaUsuario = scanner.nextInt();
        while (respuestaUsuario == 4){
            for (int i = 0; i < 4; i++) {
                
            }
        }
    }
}
