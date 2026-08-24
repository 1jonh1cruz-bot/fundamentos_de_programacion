import java.util.Scanner;

public class GananciaVinicultores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        int tamano = scanner.nextInt();

        System.out.print("Ingrese el precio inicial por kilo: ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de kilos entregados: ");
        double kilos = scanner.nextDouble();

        double precioFinal = precioInicial;

        // Evaluación de condiciones
        if (tipo == 'A') {
            if (tamano == 1) {
                precioFinal += 0.20;
            } else if (tamano == 2) {
                precioFinal += 0.30;
            } else {
                System.out.println("Tamaño no válido.");
                scanner.close();
                return;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
                precioFinal -= 0.30;
            } else if (tamano == 2) {
                precioFinal -= 0.50;
            } else {
                System.out.println("Tamaño no válido.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Tipo no válido.");
            scanner.close();
            return;
        }

        double gananciaTotal = precioFinal * kilos;

        System.out.printf("El precio final por kilo es: $%.2f%n", precioFinal);
        System.out.printf("La ganancia total del embarque es: $%.2f%n", gananciaTotal);

        scanner.close();
    }
}