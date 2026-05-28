public abstract class Personal {
    int numero;
    String nombre;

    public Personal(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public abstract int sueldoBruto();
}
