import java.sql.SQLOutput;
import java.util.Scanner;

public class Paciente {
    Scanner teclado = new Scanner(System.in);
    String name;
    int age;
    String numExpediente;

    public void mostrarInformacion(){
        System.out.printf("""
                Nombre del paciente %s
                Edad del paciente: %d
                Numero de expediente %s""", name, age, numExpediente);
    }
}

