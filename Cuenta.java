public class Cuenta {
    public static void main(String[] args) {
        String s = "hola, llego y dijo hola, despues otra vez hola";
        int i;
        int apariciones = 0;

        while ((i = s.indexOf("hola")) != -1) {
            apariciones++;
            s = s.substring(i + 1);
        }

        System.out.println("El string hola aparecio " + apariciones + " veces");
    }
}
