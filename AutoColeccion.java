public class AutoColeccion extends Auto {
    String comentarios;
    int valorColeccion;
    static int cantidad = 0;

    public AutoColeccion() {
        super();
        cantidad++;
        comentarios = "Nada por ahora";
        valorColeccion = 0;
    }

    @Override
    public void cambiaConstruccion(int anio) {
        construccion = anio;
        comentarios = "Se cambio el valor de construccion";
    }

    public static int cuantos() {
        return cantidad;
    }
}
