import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Numero extends Remote {
    int getNumero() throws RemoteException;
}
