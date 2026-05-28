public class ExpresionesAsignacion {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 3;
        int suma = a + b;
        int modulo = a % c;
        boolean mayor = a > b;
        String nombre = "Willi";
        String mensaje = "Hola " + nombre + ", hoy practicamos Java";
        int aleatorio = (int) (Math.random() * 100) + 1;
        int resultado = a == 10 ? a + 1 : a - 1;

        System.out.println("Suma: " + suma);
        System.out.println("Modulo: " + modulo);
        System.out.println("a > b: " + mayor);
        System.out.println(mensaje);
        System.out.println("Aleatorio: " + aleatorio);
        System.out.println("Operador ternario: " + resultado);
    }
}
