import java.rmi.Naming;

public class ClienteNumero {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        try {
            Numero n = (Numero) Naming.lookup("//" + host + "/elNumero");
            System.out.println("El numero vale ahora " + n.getNumero());
        } catch (Exception e) {
            System.out.println("Error consultando objeto remoto: " + e.getMessage());
        }
    }
}
