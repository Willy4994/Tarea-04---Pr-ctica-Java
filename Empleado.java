public class Empleado extends Personal {
    int sueldoBase;
    int asignacion;

    public Empleado(int numero, String nombre, int sueldoBase, int asignacion) {
        super(numero, nombre);
        this.sueldoBase = sueldoBase;
        this.asignacion = asignacion;
    }

    @Override
    public int sueldoBruto() {
        return sueldoBase + asignacion;
    }
}
