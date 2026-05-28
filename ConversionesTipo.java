public class ConversionesTipo {
    public static void main(String[] args) {
        int i = 1;
        long l = i;
        l = 1000000000000L;
        float f = l;
        double d = 1.0;
        int enteroConvertido = (int) d;
        int valor = 256;
        byte b = (byte) valor;

        System.out.println("int a long: " + l);
        System.out.println("long a float: " + f);
        System.out.println("double a int con cast: " + enteroConvertido);
        System.out.println("int 256 a byte: " + b);
    }
}
