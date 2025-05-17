package reto1;
import java.util.*;
public class RegistroMuestras {
    public static void main(String[] args) {
        //arrayList para el registro de muestras por defecto
        ArrayList<String> especies = new ArrayList<>();
        especies.add("Homo sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis thaliana");
        especies.add("Homo sapiens");
        System.out.println("Tipos de muestras (ordenados, con duplicados): ");
        for (int i = 0; i < especies.size(); i++) {
            System.out.println( i + 1 + ". " + especies.get(i));
        }
        //HashSet: registros unicos, sin duplicados
        HashSet<String> tiposEspecies = new HashSet<>(especies); //eliminar duplicados
        System.out.println("\nEspecies únicas registradas: ");
        for (String especie : tiposEspecies){
            System.out.println("- " + especie);
        }
        //HashMap: asociar ID de muestra con el investigador
        HashMap<String, String> muestraInvestigador = new HashMap<>();
        muestraInvestigador.put("M-001", "Dra. Barrón");
        muestraInvestigador.put("M-002", "Dra. Salas");
        muestraInvestigador.put("M-003", "Dr. Cumberbatch");
        System.out.println("\nResponsables del muestreo (ID Muestra -> Responsable): ");
        for (Map.Entry<String, String> entry : muestraInvestigador.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //Busqueda de muestra por ID
        String idBuscar = "M-002";
        System.out.println("\nMuestra: " + idBuscar + "\nResponsable: " + muestraInvestigador.get(idBuscar));
    }
}
