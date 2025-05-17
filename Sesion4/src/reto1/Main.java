package reto1;

public class Main {
    public static void main(String[] args) {
        //creamos objetos con el mismo folio
        Factura f1 = new Factura("FAC231", "Martin", 2350.00);
        Factura f2 = new Factura("FAC231", "Lorena", 2350.00);
        //imprimimos en consola con toString()
        System.out.println(f1);
        System.out.println(f2);
        //comparamos folios con equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }

}
