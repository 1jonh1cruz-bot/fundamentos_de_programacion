import java.util.Scanner;

public class MultaVelocidad {

    public static int calcularMulta(int speed, boolean isBirthday) {
        int limiteSinMulta = 60;
        int limiteMultaPequena = 80;
        
        if (isBirthday) {
            limiteSinMulta += 5;
            limiteMultaPequena += 5;
        }
        
        if (speed <= limiteSinMulta) {
            return 0;
        } else if (speed <= limiteMultaPequena) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la velocidad: ");
        int velocidad = scanner.nextInt();
        
        System.out.print("¿Es tu cumpleaños? (true/false): ");
        boolean esCumpleanios = scanner.nextBoolean();
        
        int resultado = calcularMulta(velocidad, esCumpleanios);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}