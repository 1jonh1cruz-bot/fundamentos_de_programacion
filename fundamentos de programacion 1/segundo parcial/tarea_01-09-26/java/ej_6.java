import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioBase = 0;

        System.out.println("Seleccione el sabor (1: Manzana | 2: Fresa | 3: Chocolate): ");
        int opcionSabor = scanner.nextInt();

        switch (opcionSabor) {
            case 1: // Manzana
                precioBase = 200;
                break;

            case 2: // Fresa
                precioBase = 250;
                break;

            case 3: // Chocolate (Switch anidado)
                System.out.println("Seleccione tipo de chocolate (1: Negro $280 | 2: Blanco $300): ");
                int tipoChocolate = scanner.nextInt();

                switch (tipoChocolate) {
                    case 1:
                        precioBase = 280;
                        break;
                    case 2:
                        precioBase = 300;
                        break;
                    default:
                        System.out.println("Tipo de chocolate no válido.");
                        scanner.close();
                        return;
                }
                break;

            default:
                System.out.println("Sabor no válido.");
                scanner.close();
                return;
        }

        // Snacks ($25 por cada uno)
        System.out.print("¿Cuántos snacks desea agregar?: ");
        int cantidadSnacks = scanner.nextInt();
        double costoSnacks = cantidadSnacks * 25;

        // Nombre personalizado ($30 extra)
        System.out.print("¿Desea personalizar con un nombre? (1: Sí / 2: No): ");
        int opcionNombre = scanner.nextInt();
        double costoNombre = 0;

        switch (opcionNombre) {
            case 1:
                costoNombre = 30;
                break;
            case 2:
                costoNombre = 0;
                break;
        }

        double total = precioBase + costoSnacks + costoNombre;

        System.out.println("\n--- Presupuesto ---");
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Snacks: +$" + costoSnacks);
        System.out.println("Nombre: +$" + costoNombre);
        System.out.println("Total a pagar: $" + total + " pesos");

        scanner.close();
    }
}