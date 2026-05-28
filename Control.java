public class Control {
    public static void main(String[] args) {
        int numero = 3;

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero no es positivo");
        }

        int contador = 0;
        while (contador < 3) {
            System.out.println("while: " + contador);
            contador++;
        }

        do {
            System.out.println("do while: " + contador);
            contador--;
        } while (contador > 0);

        for (int i = 1; i <= 3; i++) {
            System.out.println("for: " + i);
        }

        switch (numero) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Otro numero");
        }
    }
}
