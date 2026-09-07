import java.util.Scanner;
public class numerosN {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

         int suma=0;
        System.out.println("ingresa el numero limite naturales:");
        int N = sc.nextInt();
int i=1;
        while (i<=N){
            suma=suma+i ;
            i++;
    }
    System.out.println("la suma de los primeros:" + N + " numeros  es:" + suma);
    sc.close();
    }}
    