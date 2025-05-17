package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        //creamos empleado y asignamos datos
        Empleado e = new Empleado();
        e.setNombre("Lorena");
        e.setEdad(24);
        e.mostrarInfo();
        //creamos contrato inmutable
        Contrato c = new Contrato("Tiempo completo", 15000.0);
        c.mostrarInfo();
    }
}
