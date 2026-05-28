import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramaIO {
    public static void main(String[] args) {
        try (
            BufferedReader in = new BufferedReader(new FileReader("Origen.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("Destino.txt"))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
            System.out.println("Archivo copiado correctamente a Destino.txt");
        } catch (IOException e) {
            System.out.println("Problemas de entrada/salida: " + e.getMessage());
        }
    }
}
