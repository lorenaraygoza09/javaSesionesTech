//ejemplo1
public class Main {
        public static void main(String[] args) {
            int edad = 23;
            double salario = 15499.50;
            boolean activo = true;
            char inicial = 'L';
            //se puede usar "var" para declarar variables, el compilador infiere el tipo de dato automaticamente pero
            //no es recomendable usarlo mucho, sobre todo cuando a las variables no se les ha asignado un valor
            var ciudad = "Mazatlán";
            String name = "Lorena";

            // Imprimir los valores almacenados en las variables
            System.out.println("Nombre: " + name);
            System.out.println("Edad: " + edad);
            System.out.println("Salario: $" + salario);
            System.out.println("Activo: " + activo);
            System.out.println("Inicial: " + inicial);
            System.out.println("Ciudad: " + ciudad);

            // Conversiónes
            double precio = 199.99;
            int precioRedondeado = (int) precio;
            System.out.println("Precio original: " + precio);
            System.out.println("Precio redondeado: " + precioRedondeado);
        }
    }
