public class Auto {
    String nombre;
    int construccion = 1990;
    float rend;

    public Auto() {
        nombre = "Yiguly";
        rend = 15;
    }

    public Auto(String nombre, int construccion, float rend) {
        this.nombre = nombre;
        this.construccion = construccion;
        this.rend = rend;
    }

    public void cambiaConstruccion(int anio) {
        construccion = anio;
    }

    public float rendimientoEnKxL() {
        return 100 / rend;
    }
}
