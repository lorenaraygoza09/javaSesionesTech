package reto2;

public class Main {
    public static void main(String[] args) {
    DeclaracionImpuestos dImp = new DeclaracionImpuestos("LMRI010203", 2550);
    CuentaFiscal cFis = new CuentaFiscal("LMRI010203", 2550);
        System.out.println("Declaración enviada por RFC: " + dImp.rfcContribuyente() + " por $" + dImp.montoDeclarado());
        System.out.println("Cuenta fiscal registrada con RFC: " + cFis.getRfc() + ", saldo disponible: $" + cFis.getSaldoDisponible());
        System.out.println("¿RFC válido para esta cuenta?: " + cFis.validarRFC(dImp));
    }
}
