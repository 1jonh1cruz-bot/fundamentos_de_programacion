import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioBase = 0;

        System.out.println("--- Presupuesto de Tartas ---");
        System.out.print("Ingrese el sabor de la tarta (manzana, fresa, chocolate): ");
        String sabor = scanner.nextLine().toLowerCase().trim();

        // 1. Evaluación del sabor base
        switch (sabor) {
            case "manzana":
                precioBase = 200;
                break;

            case "fresa":
                precioBase = 250;
                break;

            case "chocolate":
                System.out.print("¿Qué tipo de chocolate prefiere? (negro / blanco): ");
                String tipoChocolate = scanner.nextLine().toLowerCase().trim();

                // Switch anidado para el tipo de chocolate
                switch (tipoChocolate) {
                    case "negro":
                        precioBase = 280;
                        break;
                    case "blanco":
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

        // 2. Cantidad de snacks
        System.out.print("¿Cuántos snacks desea agregar (fresa, galleta, durazno, etc.)?: ");
        int cantidadSnacks = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer del teclado
        double costoSnacks = cantidadSnacks * 25;

        // 3. Personalización con nombre
        System.out.print("¿Desea personalizar con un nombre? (si / no): ");
        String respuestaNombre = scanner.nextLine().toLowerCase().trim();
        double costoNombre = 0;

        switch (respuestaNombre) {
            case "si":
            case "sí":
                costoNombre = 30;
                break;
            case "no":
                costoNombre = 0;
                break;
            default:
                System.out.println("Respuesta no válida para el nombre. Se asumirá que no.");
                break;
        }

        // 4. Cálculo final
        double total = precioBase + costoSnacks + costoNombre;

        // Resumen
        System.out.println("\n--- Resumen del Presupuesto ---");
        System.out.println("Precio base de la tarta: $" + precioBase + " pesos");
        System.out.println("Costo por snacks (" + cantidadSnacks + "): +$" + costoSnacks + " pesos");
        System.out.println("Personalización de nombre: +$" + costoNombre + " pesos");
        System.out.println("---------------------------------");
        System.out.println("Total a pagar: $" + total + " pesos");

        scanner.close();
    }
}