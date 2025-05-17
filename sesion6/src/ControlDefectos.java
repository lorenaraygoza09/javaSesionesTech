import java.util.*;
public class ControlDefectos {
    public static void main(String[] args) {
        //arrayList: registrar reportes por defecto
        ArrayList<String> reportes = new ArrayList<>();
        reportes.add("Falla en rosca");
        reportes.add("Golpe en la superficie");
        reportes.add("Falla en rosca"); //repetido
        reportes.add("Pintura irregular");
        System.out.println("Reportes de defectos (ordenados, con duplicados): ");
        for (int i = 0; i < reportes.size(); i++) {
            System.out.println(i + 1 + ". " + reportes.get(i));
        }

        //HashSet: registrar defectos unicos
        HashSet<String> tiposDefecto = new HashSet<>(reportes); //elimina duplicados
        System.out.println("\n Tipos únicos de defecto encontrados");
        for (String defecto : tiposDefecto){
            System.out.println("- " + defecto);
        }

        //HashMap: asociar ID de lote con la causa del rechazo
        HashMap<String, String> lotesRechazados = new HashMap<>();
        lotesRechazados.put("L-001", "Falla en rosca");
        lotesRechazados.put("L-002", "Golpe en superficie");
        lotesRechazados.put("L-003", "Pintura irregular");

        System.out.println("\n Lotez rechazados (ID -> Causa): ");
        for (Map.Entry<String, String> entry : lotesRechazados.entrySet()){
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }

        //buscar causa de rechazo por ID
        String idBuscar = "L-001";
        System.out.println("\n Causa del rechazo para " + idBuscar + ": " + lotesRechazados.get(idBuscar));
    }
}
