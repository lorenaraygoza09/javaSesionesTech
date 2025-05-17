package Encapsulacion;
//clase inmutable con FINAL
public final class Contrato {
    private final String tipo;
    private final double salario;
//constructor
    public Contrato(String tipo, double salario) {
        this.tipo = tipo;
        this.salario = salario;
    }
//getters
    public String getTipo() {
        return tipo;
    }

    public double getSalario() {
        return salario;
    }
    //metodo para mostrar info
    public void mostrarInfo(){
        System.out.println("Contrato: " + tipo + ", Salario: $" + salario);
    }
}
