import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NumeroImpl extends UnicastRemoteObject implements Numero {
    private int contador = 0;

    public NumeroImpl() throws RemoteException {
        super();
    }

    @Override
    public synchronized int getNumero() throws RemoteException {
        return contador++;
    }

    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        try {
            NumeroImpl n = new NumeroImpl();
            Naming.rebind("//" + host + "/elNumero", n);
            System.out.println("Numero creado y publicado en RMI");
        } catch (Exception e) {
            System.out.println("Error publicando objeto remoto: " + e.getMessage());
        }
    }
}
