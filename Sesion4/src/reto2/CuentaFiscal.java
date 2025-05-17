package reto2;

import java.util.Objects;

public class CuentaFiscal {
    //atributo string no modificable
     private final String rfc;
     private double saldoDisponible;
//constructor con validacion para que el saldo no sea negativo
    public CuentaFiscal(String rfc, double saldoDisponible) {
        if (saldoDisponible < 0){
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }
    //getters para ambos atributos
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
    //metodo que compara RFC
    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }
}
