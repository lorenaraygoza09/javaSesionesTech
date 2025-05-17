package reto2;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

class Tema implements Comparable<Tema>{
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }
    //ordenamos por titulo
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }
    @Override
    public String toString(){
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}
