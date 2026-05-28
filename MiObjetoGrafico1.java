public class MiObjetoGrafico1 implements ObjetoGrafico {
    private int origenX;
    private int origenY;
    private int ancho;
    private int alto;
    private boolean estaVisible;

    public MiObjetoGrafico1(int origenX, int origenY, int ancho, int alto) {
        this.origenX = origenX;
        this.origenY = origenY;
        this.ancho = ancho;
        this.alto = alto;
        this.estaVisible = true;
    }

    @Override
    public void trasladar(int x, int y) {
        if (origenX + x <= MAX_ANCHO && origenX + x >= 0) {
            origenX += x;
        }
        if (origenY + y <= MAX_ALTO && origenY + y >= 0) {
            origenY += y;
        }
    }

    @Override
    public void escalar(float p) {
        if (p > 0) {
            ancho = Math.round(ancho * p);
            alto = Math.round(alto * p);
        }
    }

    @Override
    public boolean visible() {
        return estaVisible;
    }

    public void mostrarDatos() {
        System.out.println("Origen: (" + origenX + ", " + origenY + ")");
        System.out.println("Tamano: " + ancho + " x " + alto);
        System.out.println("Visible: " + estaVisible);
    }
}
