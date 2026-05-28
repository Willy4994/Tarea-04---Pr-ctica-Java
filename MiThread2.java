public class MiThread2 implements Runnable {
    private volatile boolean activo = true;

    public void detener() {
        activo = false;
    }

    @Override
    public void run() {
        int i = 0;
        while (activo) {
            System.out.println(i++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
