package reto1;

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del medicamento deseado");
        String medicamento = teclado.nextLine();
        System.out.println("¿Cuál es su precio?");
        double precioMedicamento = teclado.nextDouble();;
        System.out.println("¿Cuantas piezas necesitas?");
        int piezas = teclado.nextInt();
        double totalSinDescuento = precioMedicamento * piezas;
        boolean aplicaDescuento =  totalSinDescuento > 500.00;
        // asignacion del descuento
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        double totalConDescuento = totalSinDescuento - descuento;
        System.out.printf("""
                Medicamento: %s
                Cantidad: %d
                Precio unitario: $%.2f
                Total sin descuento: $%.2f
                ¿Aplica descuento?: %b
                Descuento: $%.2f
                Total a pagar: $%.2f
                """, medicamento, piezas, precioMedicamento, totalSinDescuento, aplicaDescuento, descuento, totalConDescuento);
    }
}
