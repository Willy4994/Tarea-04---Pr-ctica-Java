import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ProgramaIO2 {
    public static void main(String[] args) {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new FileWriter("Destino.txt"))
        ) {
            System.out.println("Ingrese lineas. Escriba FIN para terminar.");
            String line;
            while ((line = in.readLine()) != null && !line.equalsIgnoreCase("FIN")) {
                out.println(line);
                System.out.println("Ingrese linea:");
            }
        } catch (Exception e) {
            System.out.println("Problemas: " + e.getMessage());
        }
    }
}
