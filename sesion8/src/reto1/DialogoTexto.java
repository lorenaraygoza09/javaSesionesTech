package reto1;

public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo (PaqueteNarrativo paquete){
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("Ya es fin de semana, tienes las siguientes opciones...");
    }
}
