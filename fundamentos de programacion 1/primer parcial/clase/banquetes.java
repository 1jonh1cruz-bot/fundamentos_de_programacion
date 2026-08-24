import java.util.Scanner;

public class  banquetes{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    {
            System.out.println("introduce el numero de personas:");
            int np= sc.nextInt ();
            double costo=0; 
            if (np < 200){
             costo = np*95; 
                System.out.println("el costo es de 95 y el costo total es :" + costo);
            }else if (np >= 200 && np <300){
            costo = np*85;
                    System.out.println("el costo es de 85  y el costo total es:" + costo);
            }else if (np >=300){
            costo = np*75;
            System.out.println("el costo es de 75  y el costo total es:"+costo);
        
            }
        sc.close();
            }}}  
;