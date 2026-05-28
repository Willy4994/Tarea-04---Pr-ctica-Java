public class Gerente extends Personal {
    int sueldoFijo;
    int participacion;

    public Gerente(int numero, String nombre, int sueldoFijo, int participacion) {
        super(numero, nombre);
        this.sueldoFijo = sueldoFijo;
        this.participacion = participacion;
    }

    @Override
    public int sueldoBruto() {
        return sueldoFijo + (int) (participacion * 1.5);
    }
}
