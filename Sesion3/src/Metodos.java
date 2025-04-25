//void = acciones sin retorno
//return se usa para asignar el valor a variables y hacer operaciones
//sobrecarga = multiples versiones de un metodo con el mismo nombre


public class Metodos {
    //metodo sin parametros y sin retorno, solo lo muestra en
    //consola
    public void mostrarBienvenida(){
        System.out.println("Hola! bienvenido al sistema.");
    }
    //metodo con parametros y sin retorno, solo muestra en
    //consola
    public void mostrarSuma(int a, int b){
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    //metodo con parametros y retorno
    //el retorno no imprime en consola, se puede asignar a variables
    public int obtenerSuma(int a, int b) {
        return a + b;
    }
    //paso por valor
    public void duplicar(int numero){
        numero = numero * 2;
        System.out.println("Dentro del metodo: " + numero);
    }
    //paso por referencia
    public static class Persona {
        String nombre;
        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }
    //sobrecarga de metodos: definir varias versiones del mismo
    // metodo con distintos parametros
    public void saludar(){
        System.out.println("Hola!!");
    }
    public void saludar(String nombre){
        System.out.println("Hola, " + nombre + "!");
    }
}

