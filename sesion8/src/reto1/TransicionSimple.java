package reto1;

public class TransicionSimple implements TransicionHistoria{

    @Override
    public void realizarTransicion(String decision) {
        if(decision.equalsIgnoreCase("A")){
            System.out.println("El jugador decide buscar sus trajes de baño para ir a bañarse en la playa...");
        } else {
            System.out.println("El jugador regresa a la ciudad después de unas largas vacaciones...");
        }
    }
}
