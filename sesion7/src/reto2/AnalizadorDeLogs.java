package reto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) throws IOException {
        Path rutaLog = Paths.get("sesion7/src/reto2/errores.log"); //Path correcto
        Path rutaError = Paths.get("sesion7/src/reto2/registroFallos.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        //lectura eficiente
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)){
            String linea;
            while((linea = lector.readLine()) != null){
                totalLineas++;
                if(linea.contains("ERROR")){
                    conteoErrores++;
                }
                if (linea.contains("WARNING")){
                    conteoWarnings++;
                }
            }
            //mostrar resumen
            System.out.println("Analisis completado: ");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores: " + conteoErrores);
            System.out.println("Total de advertencias: " + conteoWarnings);

            double porcentajeErrores =  (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;
            System.out.printf("📈 Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("📉 Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + e.getMessage());

            //registrar fallo en archivo externo
            try(BufferedWriter escritor = Files.newBufferedWriter(rutaError)){
            escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("❌ Además, no se pudo escribir en el archivo de registro de fallos.");
            }
        }

    }
}
