package Encapsulacion;

public class Empleado {
    //atributos privados
    private String nombre;
    private int edad;

    //constructor vacio
    public Empleado(){}

    public String getNombre() {
        return nombre;
    }
    //setter con validacion
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }
//setter con validacion
    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor a 0.");
        }
    }
    //metodo para mostrar informacion
    public void mostrarInfo(){
        System.out.println("Empleado: " + nombre + ", Edad: " + edad);
    }
}
