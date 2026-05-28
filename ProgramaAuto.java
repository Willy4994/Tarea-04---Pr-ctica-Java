public class ProgramaAuto {
    public static void main(String[] args) {
        Auto miAuto1 = new Auto("Volkswagen", 1994, 9.65f);

        System.out.println("Mi auto es un " + miAuto1.nombre
                + ", fue construido en " + miAuto1.construccion
                + " y gasta " + miAuto1.rend + " litros cada 100km.");
        System.out.println("Rendimiento en km/l: " + miAuto1.rendimientoEnKxL());
    }
}
