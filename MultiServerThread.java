import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiServerThread extends Thread {
    private final Socket socket;
    private final int numeroCliente;

    public MultiServerThread(Socket socket, int numeroCliente) {
        this.socket = socket;
        this.numeroCliente = numeroCliente;
    }

    @Override
    public void run() {
        try (
            Socket s = socket;
            PrintWriter out = new PrintWriter(s.getOutputStream(), true)
        ) {
            out.println("Hola cliente numero " + numeroCliente);
            out.println("Conexion finalizada. Adios.");
        } catch (IOException e) {
            System.out.println("Error atendiendo cliente: " + e.getMessage());
        }
    }
}
