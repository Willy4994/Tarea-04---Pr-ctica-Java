public class ProgramaAutoColeccion {
    public static void main(String[] args) {
        AutoColeccion auto1 = new AutoColeccion();
        AutoColeccion auto2 = new AutoColeccion();

        auto1.cambiaConstruccion(1965);

        System.out.println("Auto 1: " + auto1.nombre + " - " + auto1.construccion);
        System.out.println("Comentario: " + auto1.comentarios);
        System.out.println("Cantidad de autos de coleccion: " + AutoColeccion.cuantos());
    }
}
