import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class LeerURL {
    public static void main(String[] args) {
        String direccion = args.length > 0 ? args[0] : "https://example.com";

        try {
            URL miURL = new URL(direccion);
            URLConnection conexion = miURL.openConnection();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo leer el URL: " + e.getMessage());
        }
    }
}
