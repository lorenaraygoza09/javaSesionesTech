public class Main {
    public static void main(String[] args) {

        // Constructor por defecto
        TicketSoporte ticket1 = new TicketSoporte();
        System.out.println("\n✅ Ticket creado con constructor por defecto:");
        ticket1.mostrarInfo();

        // Constructor con parámetros
        TicketSoporte ticket2 = new TicketSoporte("Error al iniciar sesión", "Accesos", 1, true);
        System.out.println("\n✅ Ticket creado con parámetros:");
        ticket2.mostrarInfo();

        // Cerrar ticket y mostrar nuevamente
        ticket2.cerrar();
        ticket2.mostrarInfo();

        // Constructor de copia
        TicketSoporte ticket3 = new TicketSoporte(ticket2);
        System.out.println("\n✅ Ticket copiado desde otro:");
        ticket3.mostrarInfo();

        // Constructor sobrecargado con solo título
        TicketSoporte ticket4 = new TicketSoporte("Consulta sobre facturación");
        System.out.println("\n✅ Ticket con constructor sobrecargado (solo título):");
        ticket4.mostrarInfo();

        // Creamos dos tickets con los mismos valores
        TicketSoporte t1 = new TicketSoporte("Error de login", "Accesos", 1);
        TicketSoporte t2 = new TicketSoporte("Error de login", "Accesos", 1);

        // Comparación con equals()
        System.out.println("¿Son iguales? " + t1.equals(t2));  // true

        // Hash codes
        System.out.println("Hash de t1: " + t1.hashCode());
        System.out.println("Hash de t2: " + t2.hashCode());

        // Representación legible del objeto
        System.out.println("Ticket 1:");
        System.out.println(t1);
    }
}
