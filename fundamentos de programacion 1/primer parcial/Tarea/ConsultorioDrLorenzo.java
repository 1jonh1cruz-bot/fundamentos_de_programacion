import java.util.Scanner;

public class ConsultorioDrLorenzo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cita del paciente: ");
        int numeroCita = scanner.nextInt();

        double costoCita = 0;
        double costoTotal = 0;

        if (numeroCita >= 1 && numeroCita <= 3) {
            costoCita = 900;
            costoTotal = numeroCita * 900;
        } else if (numeroCita >= 4 && numeroCita <= 5) {
            costoCita = 800;
            costoTotal = 2700 + ((numeroCita - 3) * 800);
        } else if (numeroCita >= 6 && numeroCita <= 8) {
            costoCita = 600;
            costoTotal = 4300 + ((numeroCita - 5) * 600);
        } else if (numeroCita > 8) {
            costoCita = 500;
            costoTotal = 6100 + ((numeroCita - 8) * 500);
        } else {
            System.out.println("Error: El número de cita debe ser mayor o igual a 1.");
            scanner.close();
            return;
        }

        System.out.println("\n--- Resumen de Cobro ---");
        System.out.println("a) Pago por la cita #" + numeroCita + ": $" + costoCita);
        System.out.println("b) Monto pagado en total por el tratamiento: $" + costoTotal);

        scanner.close();
    }
}