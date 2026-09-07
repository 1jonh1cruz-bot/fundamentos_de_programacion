import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        int Op;

        do {
            System.out.println("Seleccione area 1:cuadrado  2:rectangulo  3:triangulo  4:circulo");
            Op = scanner.nextInt();

            // 1. Primero el if para el círculo
            if (Op == 4) {
                System.out.println("Ingresa el radio: ");
                double R = scanner.nextDouble();
                double area1 = 3.1416 * R * R;
                System.out.println("El area es: " + area1);
            } 
            // 2. Luego el else if para las figuras con base y altura
            else if (Op == 1 || Op == 2 || Op == 3) {
                System.out.println("Ingrese base:");
                double n1 = scanner.nextDouble();
                
                System.out.println("Ingrese altura:");
                double n2 = scanner.nextDouble();
                
                switch (Op) {
                    case 1:
                    case 2:
                        area = n1 * n2;
                        System.out.println("El area es: " + area);
                        break;
                    case 3:
                        area = (n1 * n2) / 2;
                        System.out.println("El area es: " + area);
                        break;
                }
            } 
            // 3. Al final el else para entradas inválidas
            else {
                System.out.println("Opcion invalida. Intente de nuevo.\n");
            }

        } while (Op < 1 || Op > 4);

        scanner.close();
    }
}