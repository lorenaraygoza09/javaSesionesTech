import java.util.*;
public class GestionMateriales {
    public static void main(String[] args) {
        //List: registrar orden de llegada de materiales
        //list permite duplicados
        List <String> materialesRecibidos = new ArrayList<>();
        materialesRecibidos.add("Tornillo M6");
        materialesRecibidos.add("Arandela 8mm");
        materialesRecibidos.add("Tornillo M6"); //repeticion
        materialesRecibidos.add("Tuerca M6");

        System.out.println("Orden de llegada de materiales: " );
        for (String material : materialesRecibidos){
            System.out.println("- " + material);
        }
        //Se: Validar lotes unicos (sin duplicados)
        Set<String> lotesUnicos = new HashSet<>();
        lotesUnicos.add("Lote-001");
        lotesUnicos.add("Lote-002");
        lotesUnicos.add("Lote-003");
        System.out.println("\n Lotes registrados (sin duplicados)");
        for (String lote : lotesUnicos){
            System.out.println("- " + lote);
        }

        //map: codigo de pieza asociado a descripcion
        Map<String, String> catalogoPiezas = new HashMap<>();
        catalogoPiezas.put("PZ-1001", "Tornillo M6 x 20mm");
        catalogoPiezas.put("PZ-1002", "Tuerca M6");
        catalogoPiezas.put("PZ-1003", "Arandela 8mm");
        System.out.println("\n Catálogo de piezas (Código -> Descripción): ");
        for (Map.Entry<String, String> entrada : catalogoPiezas.entrySet()){
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
        //buscar descripcion a partir del codigo
        String codigoBuscado = "PZ-1001";
        System.out.println("\n Descripción de la pieza " + codigoBuscado + ": " + catalogoPiezas.get(codigoBuscado));
    }
}
