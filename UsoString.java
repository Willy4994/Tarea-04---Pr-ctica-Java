public class UsoString {
    public static void main(String[] args) {
        String s = "Hola Mundo";
        int largo = s.length();
        char caracter = s.charAt(1);
        String sub1 = s.substring(5);
        String sub2 = s.substring(0, 4);
        int posicion = s.indexOf("Mundo");
        boolean iguales = s.equals("Hola Mundo");
        int comparacion = s.compareTo("Hola Java");

        System.out.println("Texto: " + s);
        System.out.println("Largo: " + largo);
        System.out.println("Caracter en posicion 1: " + caracter);
        System.out.println("Substring desde 5: " + sub1);
        System.out.println("Substring 0 a 4: " + sub2);
        System.out.println("Posicion de Mundo: " + posicion);
        System.out.println("Son iguales: " + iguales);
        System.out.println("Comparacion: " + comparacion);
    }
}
