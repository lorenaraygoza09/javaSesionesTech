package InterfacesYClasesAbstractas;

public class Drone {
    String id;

    public Drone(String id){
        this.id = id;
    }

    public void despegar(){
        System.out.println("Drone " + id + " despegando...");
    }

    public void aterrizar(){
        System.out.println("Drone " + id + " aterrizando...");
    }

    //metodo abstracto que cada tipo de drone debe implementar
    public void ejecutarMision(){

    }
}
