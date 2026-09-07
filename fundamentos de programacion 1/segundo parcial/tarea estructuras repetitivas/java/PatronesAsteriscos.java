import java.util.Scanner;

public class PatronesAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // 1. CICLO DO-WHILE: Mantiene activo el menú hasta elegir salir
        do {
            System.out.println("\n--- DIBUJO DE PATRONES DE ASTERISCOS ---");
            System.out.println("1. Cuadrado de n x n");
            System.out.println("2. Pirámide Invertida");
            System.out.println("3. Pirámide Normal");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                int n;
                // Validar que n sea mayor a 0
                do {
                    System.out.print("Ingrese el número de líneas (n > 0): ");
                    n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("El número debe ser mayor a 0.");
                    }
                } while (n <= 0);

                System.out.println();

                // 2. SWITCH: Dirige la ejecución según el patrón seleccionado
                switch (opcion) {
                    case 1: // Figura 1: Cuadrado
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2: // Figura 2: Pirámide Invertida
                        for (int i = 0; i < n; i++) {
                            // Imprimir espacios iniciales
                            for (int j = 0; j < i; j++) {
                                System.out.print(" ");
                            }
                            // Imprimir asteriscos (2*(n-i)-1)
                            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 3: // Figura 3: Pirámide Normal
                        for (int i = 1; i <= n; i++) {
                            // Imprimir espacios iniciales (n - i)
                            for (int j = 1; j <= (n - i); j++) {
                                System.out.print(" ");
                            }
                            // Imprimir asteriscos (2*i - 1)
                            for (int j = 1; j <= (2 * i - 1); j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}