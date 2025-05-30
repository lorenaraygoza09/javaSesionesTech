import java.util.Objects;

public class Principal {
        public static void main(String[] args) {
            // Creamos dos empleados con valores null en el nombre
            Empleado.Worker e1 = new Empleado.Worker(null, 25);
            Empleado.Worker e2 = new Empleado.Worker(null, 25);

            // Usamos Objects.equals() para comparar los nombres (evita NullPointerException)
            boolean nombresIguales = Objects.equals(e1.nombre(), e2.nombre());

            // Mostramos los objetos y la comparación
            System.out.println("Empleado 1: " + e1);
            System.out.println("Empleado 2: " + e2);
            System.out.println("¿Los nombres son iguales?: " + nombresIguales);
        }
    }
