import java.util.Scanner;

public class BecaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        System.out.println("\n--- Resultado del Estímulo ---");

        if (edad > 18) {
            // Estudiantes mayores de 18 años
            if (promedio >= 9.0) {
                System.out.println("Felicidades. Se le otorga una beca de $10,000.00");
            } else if (promedio >= 7.5) {
                System.out.println("Felicidades. Se le otorga una beca de $8,000.00");
            } else if (promedio >= 6.0) {
                System.out.println("Felicidades. Se le otorga una beca de $5,000.00");
            } else {
                System.out.println("Se le enviará una carta de invitación incitándolo a estudiar más para el próximo ciclo escolar.");
            }
        } else {
            // Estudiantes de 18 años o menores
            if (promedio >= 9.0) {
                System.out.println("Felicidades. Se le otorga una beca de $8,000.00");
            } else if (promedio >= 8.0) {
                System.out.println("Felicidades. Se le otorga una beca de $6,000.00");
            } else if (promedio >= 6.0) {
                System.out.println("Felicidades. Se le otorga una beca de $4,000.00");
            } else {
                System.out.println("Se le enviará una carta de invitación incitándolo a estudiar más para el próximo ciclo escolar.");
            }
        }

        scanner.close();
    }
}