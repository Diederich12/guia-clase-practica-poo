public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion Camion = new Camion("Volvo", "Fh", 2019, 75000, 2000, 4);

        // Mostrar la informacion de cada vehiculo
        System.out.println("\nInformacion del Auto: ");
        auto.mostrarInfo();

        System.out.println("\nInformacion del Camion: ");
        Camion.mostrarInfo();

        System.out.println("\nInformacion del Camion: ");
        Camion.mostrarInfo();
        Camion.RealizarMantenimiento();
        auto.RealizarMantenimiento();

        System.out.println("El costo total del mantenimiento: ");
        auto.CostoMantenimiento(10, 12);
    }


    
}
