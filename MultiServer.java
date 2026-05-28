import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
    public static void main(String[] args) {
        int puerto = 4444;
        int numeroCliente = 1;

        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor escuchando en el puerto " + puerto);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new MultiServerThread(clientSocket, numeroCliente++).start();
            }
        } catch (IOException e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }
}
