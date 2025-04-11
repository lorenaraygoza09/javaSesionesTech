import java.util.Scanner;

public class LoginSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseniaCorrecta = "admin123";
        String input;
        int intentos = 0;
        int maxIntentos = 3;
        while ( intentos < maxIntentos ){
            System.out.println("Ingresa tu contraseña: ");
            input = scanner.nextLine();
            if(input.equals(contraseniaCorrecta)) {
                System.out.println("Acceso permitido.");
                break;
            } else {
                System.out.println("Acceso denegado.");
                intentos++;
            }
        }
        if ( intentos == maxIntentos) {
            System.out.println("Cuenta bloqueada por multiples intentos.");
        }
        scanner.close();
    }
}
