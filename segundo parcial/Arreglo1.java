 import java.util.Scanner;
 public class Arreglo1 {

   
    private static Scanner sc;
;
    public static void main(String[] args) {
        //int [] A = new int;
        sc = new Scanner(System.in);
        double sumaprecios=0;
    
     String []apellidos = new String[5];

    apellidos [0]= "Cruz";
    apellidos[1]= "Hernandez ";
    apellidos[2]= "Arteaga";
    apellidos[3]= "Suarez";
    apellidos[4]= "Ramo";
   
    for (int i=0; i < apellidos.length; i++){
        System.out.println(apellidos[i]);
    
   
}
int[] precios = new int[3];
for(int i=0; i<precios.length; i++)
{System.out.println("dame los precios:");
    precios [i]= sc.nextInt();

}
for (int i=0; i < precios.length; i++){
        System.out.println(precios[i]);
} 

for (int i=0; i<precios.length;i++){

     sumaprecios = sumaprecios + precios [i];
  

}
  System.out.println( "la suma es : " + sumaprecios);
  
}
}