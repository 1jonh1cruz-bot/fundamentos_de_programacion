import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioBase = 0;
        String sabor;

        System.out.println("--- Presupuesto de Tartas ---");

        // 1. Evaluación del sabor base
        do {
            System.out.print("Ingrese el sabor de la tarta (manzana, fresa, chocolate): ");
            sabor = scanner.nextLine().toLowerCase().trim();

            switch (sabor) {
                case "manzana":
                    precioBase = 200;
                    break;

                case "fresa":
                    precioBase = 250;
                    break;

                case "chocolate":
                    String tipoChocolate;
                    do {
                        System.out.print("¿Qué tipo de chocolate prefiere? (negro / blanco): ");
                        tipoChocolate = scanner.nextLine().toLowerCase().trim();

                        switch (tipoChocolate) {
                            case "negro":
                                precioBase = 280;
                                break;
                            case "blanco":
                                precioBase = 300;
                                break;
                            default:
                                System.out.println("Tipo de chocolate no valido. Intente de nuevo.\n");
                                break;
                        }
                    } while (!tipoChocolate.equals("negro") && !tipoChocolate.equals("blanco"));
                    break;

                default:
                    System.out.println("Sabor no valido. Intente de nuevo.\n");
                    break;
            }
        } while (!sabor.equals("manzana") && !sabor.equals("fresa") && !sabor.equals("chocolate"));

        // 2. Cantidad de snacks
        int cantidadSnacks = -1;
        do {
            System.out.print("¿Cuántos snacks desea agregar (fresa, galleta, durazno, etc.)?: ");
            if (scanner.hasNextInt()) {
                cantidadSnacks = scanner.nextInt();
                if (cantidadSnacks < 0) {
                    System.out.println("La cantidad de snacks no puede ser negativa.\n");
                }
            } else {
                System.out.println("Por favor ingrese un numero entero valido.\n");
                scanner.next(); // Limpiar entrada invalida
            }
        } while (cantidadSnacks < 0);
        
        scanner.nextLine(); // Limpiar el búfer del teclado
        double costoSnacks = cantidadSnacks * 25;

        // 3. Personalización con nombre
        String respuestaNombre;
        double costoNombre = 0;
        do {
            System.out.print("¿Desea personalizar con un nombre? (si / no): ");
            respuestaNombre = scanner.nextLine().toLowerCase().trim();

            switch (respuestaNombre) {
                case "si":
                case "sí":
                    costoNombre = 30;
                    break;
                case "no":
                    costoNombre = 0;
                    break;
                default:
                    System.out.println("Respuesta no valida. Intente de nuevo.\n");
                    break;
            }
        } while (!respuestaNombre.equals("si") && !respuestaNombre.equals("sí") && !respuestaNombre.equals("no"));

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