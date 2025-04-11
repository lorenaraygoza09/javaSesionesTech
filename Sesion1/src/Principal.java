public class Principal {
    public static void main(String[] args) {
        //crear un nuevo objeto de tipo estudiante
        Estudiante estudiante1 = new Estudiante();
        //asignar valores
        estudiante1.name = "Lorena";
        estudiante1.age = 23;
        //llamando al metodo saludar()
        estudiante1.Saludar();

        //objetos tipo producto
        Producto producto1 =  new Producto("Lapiz", 18.99);
        System.out.println(producto1.nombre);
    }
}
