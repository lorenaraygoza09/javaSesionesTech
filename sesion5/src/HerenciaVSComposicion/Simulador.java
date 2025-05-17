package HerenciaVSComposicion;

public class Simulador {
    public static void main(String[] args) {
        AutoAutonomo tesla = new AutoAutonomo("Tesla");
        tesla.encender();//metodo heredado
        tesla.iniciarAutonomia();//metodo propio
    }
}
