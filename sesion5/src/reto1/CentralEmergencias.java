package reto1;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Jose");
        Patrulla patrulla = new Patrulla("Patrulla", "Julian");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de bomberos", "Luis");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
        System.out.println();
    }
}
