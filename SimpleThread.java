public class SimpleThread extends Thread {
    public SimpleThread(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println(getName() + " fue interrumpido");
                return;
            }
        }
        System.out.println("DONE! " + getName());
    }
}
