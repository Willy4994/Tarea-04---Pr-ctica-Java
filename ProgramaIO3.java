import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramaIO3 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader in = new BufferedReader(new FileReader("Origen.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("Destino.txt"))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
        }
        System.out.println("Copia finalizada usando throws IOException.");
    }
}
