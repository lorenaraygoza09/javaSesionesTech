public class Producto {
    //atributos
    String nombre;
    double precio;
    // constructor que inicializa el producto con nombre y precio
    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    //metodo que imprime la info en consola
    public void mostrarInfo(){
        System.out.printf("Producto: %s, precio: %.2f.", nombre, precio);
    }
}
