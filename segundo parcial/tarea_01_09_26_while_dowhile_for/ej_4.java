

import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;
        char respuesta;
do{
        do {
            System.out.print("Introduce la hora (0-23): ");
            hora = scanner.nextInt();

            switch (hora) {
                case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                    System.out.println("Buenos días");
                    break;

                case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                    System.out.println("Buenas tardes");
                    break;

                case 21: case 22: case 23: case 0: case 1: case 2: case 3: case 4: case 5:
                    System.out.println("Buenas noches");
                    break;

                default:
                    System.out.println("Hora no válida. Intente de nuevo.\n");
                    break;
            }
        } while (hora < 0 && hora > 23);
        
            scanner.nextLine(); // Limpiar el búfer de entrada antes de leer texto

            // Pregunta final de repetición
            System.out.print("\n¿Deseas consultar otro mes? (s/n): ");
            String entrada = scanner.nextLine().toLowerCase().trim();
            respuesta = !entrada.isEmpty() ? entrada.charAt(0) : 'n';

            System.out.println(); // Salto de línea estético

        } while (respuesta == 's');

        scanner.close();
    }
}