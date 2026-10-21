import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char respuesta;

        // Bucle principal para repetir la consulta completa
        do {
            int mes;

            // Bucle interno para validar que el mes sea entre 1 y 12
            do {
                System.out.print("Ingresa el número del mes (1-12): ");
                if (scanner.hasNextInt()) {
                    mes = scanner.nextInt();

                    switch (mes) {
                        case 1:
                            System.out.println("Enero, 31 días");
                            break;
                        case 2:
                            System.out.println("Febrero, 28 días");
                            break;
                        case 3:
                            System.out.println("Marzo, 31 días");
                            break;
                        case 4:
                            System.out.println("Abril, 30 días");
                            break;
                        case 5:
                            System.out.println("Mayo, 31 días");
                            break;
                        case 6:
                            System.out.println("Junio, 30 días");
                            break;
                        case 7:
                            System.out.println("Julio, 31 días");
                            break;
                        case 8:
                            System.out.println("Agosto, 31 días");
                            break;
                        case 9:
                            System.out.println("Septiembre, 30 días");
                            break;
                        case 10:
                            System.out.println("Octubre, 31 días");
                            break;
                        case 11:
                            System.out.println("Noviembre, 30 días");
                            break;
                        case 12:
                            System.out.println("Diciembre, 31 días");
                            break;
                        default:
                            System.out.println("Mes no válido. Intenta nuevamente.\n");
                            break;
                    }
                } else {
                    System.out.println("Por favor ingresa un número entero válido.\n");
                    scanner.next(); // Limpiar entrada no válida
                    mes = -1; // Forzar repetición del bucle de validación
                }
            } while (mes < 1 || mes > 12);

            scanner.nextLine(); // Limpiar el búfer de entrada antes de leer texto

            // Pregunta final de repetición
            System.out.print("\n¿Deseas consultar otro mes? (s/n): ");
            String entrada = scanner.nextLine().toLowerCase().trim();
            respuesta = !entrada.isEmpty() ? entrada.charAt(0) : 'n';

            System.out.println(); // Salto de línea estético

        } while (respuesta == 's');

        System.out.println("¡Programa finalizado! Hasta luego.");
        scanner.close();
    }
}