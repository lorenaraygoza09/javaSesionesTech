import java.util.Optional;

public class Factura {
    //atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //metodo publicp que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "Factura generada: \n";
        resumen += "Descripcion " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // si el RFC esta presente, se muestra, si no, se muestra un mensaje alternativo
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        return resumen;
    }
}

