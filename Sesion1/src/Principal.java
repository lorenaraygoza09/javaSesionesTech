public class Principal {
    public static void main(String[] args) {
        //crear un nuevo objeto de tipo estudiante
        Estudiante estudiante1 = new Estudiante();
        //asignar valores
        estudiante1.name = "Lorena";
        estudiante1.age = 23;
        //llamando al metodo saludar()
        estudiante1.Saludar();

        /* //objetos de tipo producto
        Producto producto1 = new Producto("Termo para agua", 250.35);
        producto1.mostrarInfo();
         */
    }
}
