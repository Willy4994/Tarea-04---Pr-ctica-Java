public interface ObjetoGrafico {
    int MAX_ANCHO = 800;
    int MAX_ALTO = 600;

    void trasladar(int x, int y);
    void escalar(float p);
    boolean visible();
}
