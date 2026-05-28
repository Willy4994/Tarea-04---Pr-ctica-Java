public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        MiThread2 b = new MiThread2();
        Thread t = new Thread(b);
        t.start();

        Thread.sleep(100);
        b.detener();
        t.join();
        System.out.println("Thread detenido correctamente.");
    }
}
