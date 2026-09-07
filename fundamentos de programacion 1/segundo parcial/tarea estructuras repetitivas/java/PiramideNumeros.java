import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // 1. CICLO DO-WHILE: Garantiza que el usuario ingrese un número mayor a 0
        do {
            System.out.print("Ingrese un número entero positivo (n): ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, ingrese un número mayor a 0.\n");
            }
        } while (n <= 0);

        System.out.println("\n--- PIRÁMIDE DE NÚMEROS ---");

        // 2. CICLO FOR EXTERNO: Controla la cantidad de filas (de 1 hasta n)
        for (int i = 1; i <= n; i++) {
            
            // 3. CICLO FOR INTERNO: Imprime los números de cada fila (de 1 hasta i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println(); // Salto de línea al terminar cada fila
        }

        scanner.close();
    }
}