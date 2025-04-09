public class FacturaCafeteria {
    public static void main(String[] args) {
        double cafePrecio = 45.50;
        double pastelPrecio = 80.00;
        double botellaAguaPrecio = 20.00;
        double totalCliente;

        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua = 1;

        cantidadPastel++;

        totalCliente = (cafePrecio * cantidadCafe) + (pastelPrecio * cantidadPastel) + (cantidadAgua * botellaAguaPrecio);
        //descuento si el total supera 150
        boolean aplicaDescuento =  totalCliente > 150;
        // asignacion del descuento
        double descuento = aplicaDescuento ? totalCliente * 0.10 : 0;

        double finalDescuento = totalCliente - descuento;
        System.out.printf("""
                Total de la compra: $ %.2f
                ¿Aplica descuento?: %b
                Descuento aplicado: $ %.2f
                Total a pagar: $ %.2f
                """, totalCliente, aplicaDescuento, descuento, finalDescuento);
    }
}