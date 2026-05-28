public class MCD {
    public static void main(String[] args) {
        int x = 15, y = 24;
        int originalX = x, originalY = y;

        while (x != y) {
            if (x < y) {
                y = y - x;
            } else {
                x = x - y;
            }
        }

        System.out.println("El MCD entre " + originalX + " y " + originalY + " es " + x);
    }
}
