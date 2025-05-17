package reto1;

public class Factura {
    //atributos
    private String folio;
    private String cliente;
    private double total;
    //constructor
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    //metodo toString() para presentar el objeto de forma legible
    @Override
    public String toString(){
        return "Factura [folio= " + folio + ", cliente= " + cliente + ", total= $ " + total + "]";
    }
    //metodo equals() para comparar si dos facturas tienen el mismo folio
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; //mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;
    Factura otra = (Factura) obj;
    return this.folio.equals(otra.folio); //comparamos el folio
    }

    //metodo hashCode() consistente con equals(), basado en el folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}