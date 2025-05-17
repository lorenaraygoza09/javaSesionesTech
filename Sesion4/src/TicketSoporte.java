import java.util.Objects;
public class TicketSoporte {
    //atributos de instancia
    private String titulo;
    private String categoria;
    private int prioridad;
    private boolean estaActivo;

    //constructor por defecto: no recibe parametros y asigna valores estandar
    public TicketSoporte(){
        this.titulo = "Sin titulo";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo = true;
    }
    //constructor con parametros: personalizar el objeto
    public TicketSoporte(String titulo, String categoria, int prioridad, boolean estaActivo){
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true;
    }
    //constructor de copia: nuevo objeto a partir de uno ya existente
    public TicketSoporte (TicketSoporte otro){
        this.titulo = otro.titulo;
        this.categoria = otro.categoria;
        this.prioridad = otro.prioridad;
        this.estaActivo = otro.estaActivo;
    }
    //constructor sobrecargado con solo titulo
    //sobrecarga de constructores: permite multiples formas de crear objetos con dif datos disponibles
    public TicketSoporte(String titulo) {
        this.titulo = titulo;
        this.categoria = "Sin categoría";
        this.prioridad = 3; // Baja
        this.estaActivo = true;
    }
    //metodo para mostrar la info
    public void mostrarInfo() {
        System.out.println("🎫 Ticket: " + titulo);
        System.out.println("📂 Categoría: " + categoria);
        System.out.println("⚠️ Prioridad: " + prioridad);
        System.out.println("📌 Estado: " + (estaActivo ? "Activo" : "Cerrado"));
    }
    //metodo para cerrar el ticket
    public void cerrar(){
        estaActivo = false;
        System.out.println("El ticket '" + titulo + "' ha sido cerrado.");
    }

        public TicketSoporte(String titulo, String categoria, int prioridad) {
            this.titulo = titulo;
            this.categoria = categoria;
            this.prioridad = prioridad;
            this.estaActivo = true;
        }

        // Sobrescribimos equals() para comparar contenido
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // Mismo objeto
            if (obj == null || getClass() != obj.getClass()) return false;

            TicketSoporte otro = (TicketSoporte) obj;
            return this.titulo.equals(otro.titulo) &&
                    this.categoria.equals(otro.categoria) &&
                    this.prioridad == otro.prioridad &&
                    this.estaActivo == otro.estaActivo;
        }

        // hashCode() compatible con equals()
        @Override
        public int hashCode() {
            return Objects.hash(titulo, categoria, prioridad, estaActivo);
        }

        // toString() para ver fácilmente la información del ticket
        @Override
        public String toString() {
            return "🎫 TicketSoporte {" +
                    "titulo='" + titulo + '\'' +
                    ", categoria='" + categoria + '\'' +
                    ", prioridad=" + prioridad +
                    ", estaActivo=" + estaActivo +
                    '}';
        }
    }

