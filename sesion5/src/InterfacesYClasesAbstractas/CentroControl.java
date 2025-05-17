package InterfacesYClasesAbstractas;

public class CentroControl {
    public static void main(String[] args) {
        Drone drone1 = new DroneVigilancia("R2D2");
        Drone drone2 = new DroneReparto("C-3PO");

        drone1.despegar();
        drone1.ejecutarMision();
        drone1.aterrizar();
        System.out.println();

        drone2.despegar();
        drone2.ejecutarMision();
        drone2.aterrizar();
        System.out.println();
    }

}
