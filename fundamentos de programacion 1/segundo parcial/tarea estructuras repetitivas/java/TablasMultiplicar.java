import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // 1. CICLO DO-WHILE: Repite el programa hasta que n sea igual a 0
        do {
            System.out.print("Ingrese un número para ver su tabla de multiplicar (0 para salir): ");
            n = scanner.nextInt();

            // Validación para no procesar el valor 0 de salida
            if (n != 0) {
                System.out.println("\n--- TABLA DEL " + n + " ---");
                
                // 2. CICLO FOR: Genera las 10 multiplicaciones
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
                
                System.out.println(); // Línea en blanco para separar resultados
            }

        } while (n != 0);

        System.out.println("Programa finalizado con éxito.");
        scanner.close();
    }
}