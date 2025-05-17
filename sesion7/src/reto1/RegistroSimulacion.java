package reto1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {
        //definir la ruta del archivo
        Path rutaCarpeta = Paths.get("sesion7/src/reto1/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");
    //string con parametros de la simulacion
        String parametros = "Tiempo de: 55.8segundos\n" + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";
        try{
            //crear la carpeta si no existe
            if(!Files.exists(rutaCarpeta)){
                Files.createDirectory(rutaCarpeta);
                System.out.println("Carpeta 'config' creada con exito.");
            }
            //Escribir el contenido en el archivo (crea o sobrescribe)
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            //validar la existencia del archivo
            if (Files.exists(rutaArchivo)){
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                //leer y mostrar el contenido
                String contenidoLeido =  Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo: ");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo no fue creado.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error al trabajar con el archivo: " + e.getMessage());
        }

        System.out.println("Directorio de trabajo: " + Paths.get("").toAbsolutePath());

    }
}
