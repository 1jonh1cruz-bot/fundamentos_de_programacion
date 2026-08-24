import java.util.Scanner;

public class ahorro_anual {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int mes;
        double ahorrototal = 0;

        for (mes = 1; mes <= 12; mes++){
            System.out.println("ingresa la cantidad depositada en el mes:" + mes);
            double deposito = sc.nextDouble();

            ahorrototal = ahorrototal + deposito;
            
          
            System.out.println("lleva ahorrado hasta el mes " + mes + ": $" + ahorrototal);
        }

        sc.close();
    }
}
