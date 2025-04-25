public class Proyecto {
    //atributos
    private String nombre;
    private String cliente;
    private int duracionSemanas;
    private boolean estaActivo;

    //static-atributo estatico; num total de proyectos
    public static int totalProyectos = 0;

    //final - constante: nombre del sistema
    //final - no se pueden editar los datos
    public static final String nombreSistema = "Gestor";

    //constructor
    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estaActivo){
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estaActivo = estaActivo;
        totalProyectos++; //se incrementa cada q se crea un proyecto
    }
    //mostrar la info del proyecto
    public void mostrarInfo(){
        System.out.printf("""
                Proyecto: %s
                Cliente: %s
                Duracion: %d semanas
                """, nombre, cliente, duracionSemanas);
        System.out.println("Estado: " + (estaActivo ? "Activo" : "Inactivo"));
    }
    //inactivar el proyecto
    public void cerrarProyecto(){
        estaActivo = false;
        System.out.println("El proyecto: '" + nombre + "' ha sido cerrado");
    }
}
