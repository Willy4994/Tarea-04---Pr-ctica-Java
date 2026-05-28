public class Trabajador extends Personal {
    int horasNormales;
    int horasExtras;
    int valorHoraNormal = 5000;
    int valorHoraExtra = 10000;

    public Trabajador(int numero, String nombre, int horasNormales, int horasExtras) {
        super(numero, nombre);
        this.horasNormales = horasNormales;
        this.horasExtras = horasExtras;
    }

    @Override
    public int sueldoBruto() {
        return horasNormales * valorHoraNormal + horasExtras * valorHoraExtra;
    }
}
