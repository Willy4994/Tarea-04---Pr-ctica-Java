public class ProgramaSueldos {
    public static void main(String[] args) {
        Personal[] personal = new Personal[4];
        personal[0] = new Trabajador(1, "Carlos", 40, 5);
        personal[1] = new Trabajador(2, "Ana", 35, 8);
        personal[2] = new Empleado(3, "Luis", 300000, 50000);
        personal[3] = new Gerente(4, "Maria", 600000, 100000);

        int sumaSueldosBruto = 0;
        for (Personal p : personal) {
            sumaSueldosBruto += p.sueldoBruto();
            System.out.println(p.nombre + " gana: " + p.sueldoBruto());
        }

        System.out.println("La suma de los sueldos es " + sumaSueldosBruto);
    }
}
