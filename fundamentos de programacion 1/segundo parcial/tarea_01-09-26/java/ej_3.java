import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;

        System.out.println("seleccione area 1:cuadrado  2:rectangulo  3:triangulo  4:circulo ");
        int Op = scanner.nextInt();

        // 1. Primero el if
        if (Op == 4) {
            System.out.println("ingresa el radio: ");
            double R = scanner.nextDouble();
            double area1 = 3.1416 * R * R;
            System.out.println("el area es " + area1);
        } 
        // 2. Luego el else if
        else if (Op == 1 || Op == 2 || Op == 3) {
            System.out.println("ingrese base:");
            double n1 = scanner.nextDouble();
            
            System.out.println("ingrese altura:");
            double n2 = scanner.nextDouble();
            
            switch (Op) {
                case 1:
                    area = n1 * n2;
                    System.out.println("el area es:" + area);
                    break;
                case 2:
                    area = n1 * n2;
                    System.out.println("el area es:" + area);
                    break;
                case 3:
                    area = (n1 * n2) / 2;
                    System.out.println("el area es:" + area);
                    break;
            }
        } 
        // 3. Al final el else
        else {
            System.out.println("invalido");
        }

        scanner.close();
    }
}

    