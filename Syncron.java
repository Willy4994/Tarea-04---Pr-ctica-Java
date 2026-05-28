public class Syncron {
    private int numero = 0;

    public synchronized int obtenerNumero() {
        return numero++;
    }

    public static void main(String[] args) {
        Syncron contador = new Syncron();

        Runnable tarea = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " obtuvo " + contador.obtenerNumero());
            }
        };

        new Thread(tarea, "Thread-1").start();
        new Thread(tarea, "Thread-2").start();
    }
}
