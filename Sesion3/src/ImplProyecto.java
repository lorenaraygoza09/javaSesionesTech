public class ImplProyecto {
    public static void main(String[] args) {
        //Uso de atributo final: accedemos al nombre del sistema definido como constante
        System.out.println("Sistema: " + Proyecto.nombreSistema);
        //creacion de objetos
        Proyecto p1 = new Proyecto("Sitio Web Corporativo", "Walmart", 12, true);
        Proyecto p2 = new Proyecto("App Movil", "H&M", 20, true);
        //uso de metodos
        p1.mostrarInfo();
        System.out.println();
        p2.mostrarInfo();
        System.out.println();
        //simulamos el cierre de un proyecto y mostramos la info
        p1.cerrarProyecto();
        System.out.println();
        p1.mostrarInfo();
        //atributo static: total de proyectos creados
        System.out.println("\nTotal de proyectos creados: " + Proyecto.totalProyectos);

    }
}