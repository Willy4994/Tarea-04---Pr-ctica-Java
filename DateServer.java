import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {
    public static void main(String[] args) {
        int puerto = 5555;
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("DateServer escuchando en puerto " + puerto);
            Socket socket = serverSocket.accept();
            try (ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
                out.writeObject(new Date());
            }
            socket.close();
        } catch (Exception e) {
            System.out.println("Error en DateServer: " + e.getMessage());
        }
    }
}
