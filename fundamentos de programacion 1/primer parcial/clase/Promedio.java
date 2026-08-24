import java.util.Scanner;

/**
 * Promedio
 */
public class Promedio {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
   

    System.out.println("ingrese cantidad 1");
    double C1 = sc.nextDouble ();
    System.out.println("ingrese cantidad 2");
    double C2  =sc.nextDouble ();
    System.out.println("ingrese cantidad 3");
    double C3  =sc.nextDouble ();
    if (C3 == C1 && C3 == C2){
        System.out.println("la cantidades son iguales ");}

   else if 
 (C1 > C2 && C1 >C3){
        System.out.println("la cantidad 2 es mayor ");
    }
     else if 
 (C3 > C1 && C3> C2){
        System.out.println("la cantidad 3 es mayor ");}

else if 
 (C3 == C1 && C3 ==C2)
        System.out.println("las 3 cantidades son iguales");
  else if
 (C1 == C2){
        System.out.println("la cantidad 1 es igual a la 2");}
else if
 (C2  == C3){
        System.out.println("la cantidad 2 es igual a la 3");}
 else if
 (C3 == C1){
        System.out.println("la cantidad 3 es igual a la 1");}
 
    

 
 sc.close();
}}
 ;


