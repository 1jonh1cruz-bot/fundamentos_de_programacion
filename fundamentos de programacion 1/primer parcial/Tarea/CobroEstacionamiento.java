import java.util.Scanner;

public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas que permaneció el vehículo: ");
        int horas = scanner.nextInt();

        double totalPagar = 0;

        if (horas <= 0) {
            System.out.println("Error: El tiempo ingresado debe ser de al menos 1 hora.");
            scanner.close();
            return;
        } else if (horas <= 2) {
            totalPagar = horas * 30.0;
        } else if (horas <= 5) {
            totalPagar = 60.0 + ((horas - 2) * 25.0);
        } else if (horas <= 10) {
            totalPagar = 135.0 + ((horas - 5) * 20.0);
        } else {
            totalPagar = 380.0; // Tarifa única por día completo
        }

        System.out.println("\n--- Ticket de Estacionamiento ---");
        System.out.println("Horas de uso: " + horas);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }
}