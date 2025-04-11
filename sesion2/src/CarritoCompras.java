public class CarritoCompras {
    public static void main(String[] args) {
        String[] productos = {"Lapiz", "Borrador", "Pluma", "Cuaderno"};

        //for basico
        System.out.println("Productos en el carrito: ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("- " + productos[i]);
        }
        //for each control de flujo
        System.out.println("\nIterando con for-each: ");
        for (String producto : productos) {
            if(producto.equals("Borrador")) continue; //saltar este elemento
            if(producto.equals("Pluma")) break; // detener el ciclo en este elemento
            System.out.println("Producto válido: " + producto);
        }
    }
}
