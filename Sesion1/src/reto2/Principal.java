package reto2;

public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 =  new Entrada("La bella y la bestia", 70.50);
        Entrada entrada2 = new Entrada("Pocahontas", 95.59);
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}
