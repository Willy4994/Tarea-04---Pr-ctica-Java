public class ProgramaObjetoGrafico {
    public static void main(String[] args) {
        MiObjetoGrafico1 objeto = new MiObjetoGrafico1(100, 100, 50, 40);
        objeto.mostrarDatos();
        objeto.trasladar(25, 50);
        objeto.escalar(1.5f);
        objeto.mostrarDatos();
    }
}
