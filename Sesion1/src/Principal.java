public class Principal {
    public static void main(String[] args){
        //crear un nuevo objeto de tipo estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        //asignar valores a los atributos
        estudiante1.name = "Lorena";
        estudiante1.age = 23;
        estudiante2.name = "Martin";
        estudiante2.age = 28;
        //llamando al metodo saludar()
        estudiante1.Saludar();
        estudiante2.Saludar();
    }
}
