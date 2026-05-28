public class Parametros {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No se recibieron parametros.");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Parametro " + i + ": " + args[i]);
        }
    }
}
