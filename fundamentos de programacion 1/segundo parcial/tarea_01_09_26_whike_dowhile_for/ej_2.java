import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double suma;
        Double resta;
        Double multiplicacion;
        Double division;
        int Op;

        do {
            System.out.println("Seleccione operacion 1:suma  2:resta   3:multiplicacion  4:division");
            Op = scanner.nextInt();

            if (Op < 1 || Op > 4) {
                System.out.println("Opcion no valida. Intente de nuevo.\n");
                continue;
            }

            System.out.println("Ingrese el numero 1:");
            double n1 = scanner.nextDouble();

            System.out.println("Ingrese el numero 2:");
            double n2 = scanner.nextDouble();

            switch (Op) {
                case 1:
                    suma = n1 + n2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = n1 - n2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    multiplicacion = n1 * n2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                    if (n2 != 0) {
                        division = n1 / n2;
                        System.out.println("La division es: " + division);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
            }

        } while (Op < 1 || Op > 4);

        scanner.close();
    }
}
    