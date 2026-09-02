import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

Double suma;
Double resta;
Double multiplicacion;
Double division;
          System.out.println("seleccione operacion 1:suma  2:resta   3:multiplicacion  4:division ");
int Op = scanner.nextInt();

        System.out.println("ingrese el numero 1:");
        double n1= scanner.nextDouble();
        
        System.out.println("ingrese el numero 2:");
        double n2= scanner.nextDouble();
        
switch (Op) {
            case 1:
             suma = n1+n2;
                System.out.println("la suma es"+suma);
                break;
            case 2:
            resta = n1-n2;
                System.out.println("la resta es" + resta);
                break;
            case 3:
                multiplicacion = n1*n2;
                System.out.println("la multiplicacion es " + multiplicacion);
                break;
            case 4:
                division  = n1/n2;
                System.out.println("la division es 2"+ division );
                break;
           
            default:
                System.out.println("no valido");
                break;
        }

        scanner.close();
    }
}
    