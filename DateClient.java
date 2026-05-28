import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class DateClient {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        int puerto = 5555;

        try (
            Socket socket = new Socket(host, puerto);
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream())
        ) {
            Date fecha = (Date) in.readObject();
            System.out.println("Fecha recibida del servidor: " + fecha);
        } catch (Exception e) {
            System.out.println("Error en DateClient: " + e.getMessage());
        }
    }
}
