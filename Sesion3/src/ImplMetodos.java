public class ImplMetodos {
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        obj.mostrarBienvenida();
        obj.mostrarSuma(5,15);
        System.out.println("Resultado: " + obj.obtenerSuma(9,15));
        int x = 10;
        obj.duplicar(x);
        System.out.println("Fuera del metodo: " + x);
        Metodos.Persona p1 = new Metodos.Persona("Lorena");
        System.out.println(p1.nombre);
        obj.saludar();
        obj.saludar("Lorena");
    }
}

