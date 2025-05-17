package reto2;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlaneacionEducativa {
    public static void main(String[] args) {
        //lista concurrente de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva" , 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        //orden cronologico
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente: ");
        for (Tema t : temas){
            System.out.println(t);
        }

        //orden de temas por prioridad ascendente
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });
        System.out.println("\nTemas ordenados por prioridad (1 = urgente): ");
        for (Tema t : temas){
            System.out.println(t);
        }

        //concurrente de recursos con ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        //recursos
        System.out.println("\nFuentes de los recursos por tema: ");
        for (String tema: recursos.keySet()){
            System.out.println("- " + tema + " -> " + recursos.get(tema));
        }
    }
}
