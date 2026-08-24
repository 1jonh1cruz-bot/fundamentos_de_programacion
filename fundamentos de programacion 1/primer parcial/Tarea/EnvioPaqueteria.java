import java.util.Scanner;

public class EnvioPaqueteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kilos (kg): ");
        double pesoKilos = scanner.nextDouble();

        // Validar límite de peso (máximo 5 kg)
        if (pesoKilos > 5 || pesoKilos <= 0) {
            System.out.println("RECHAZADO: El paquete no puede ser transportado por cuestiones de logística y seguridad (Máximo 5 kg).");
            scanner.close();
            return;
        }

        System.out.println("\n--- Selección de Zona ---");
        System.out.println("1. América del Norte ($11 / gramo)");
        System.out.println("2. América Central ($10 / gramo)");
        System.out.println("3. América del Sur ($12 / gramo)");
        System.out.println("4. Europa ($25 / gramo)");
        System.out.println("5. Asia ($30 / gramo)");
        System.out.print("Ingrese el número de zona de destino (1-5): ");
        int zona = scanner.nextInt();

        double costoGramo;

        switch (zona) {
            case 1:
                costoGramo = 11.0;
                break;
            case 2:
                costoGramo = 10.0;
                break;
            case 3:
                costoGramo = 12.0;
                break;
            case 4:
                costoGramo = 25.0;
                break;
            case 5:
                costoGramo = 30.0;
                break;
            default:
                System.out.println("Error: Zona no válida.");
                scanner.close();
                return;
        }

        // Conversión a gramos para calcular el costo
        double pesoGramos = pesoKilos * 1000;
        double costoTotal = pesoGramos * costoGramo;

        System.out.println("\n--- Resumen de Envío ---");
        System.out.println("Peso ingresado: " + pesoKilos + " kg (" + pesoGramos + " g)");
        System.out.println("El cobro total por la entrega del paquete es: $" + costoTotal);

        scanner.close();
    }
}