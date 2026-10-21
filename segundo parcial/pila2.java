import java.util.Scanner; 

public class pila2 { 
    public static void main(String [] args){ 
        Scanner sc = new Scanner(System.in); 
        
       

int calif;
int opcion1;



       
        
       
         System.out.println("cuantas calificacines son:");
         calif=sc.nextInt();
        int calificaciones []= new int[calif];
        int opcion;


        do{
        System.out.println("----menu----");
         System.out.println("1.ingresar calificaciones");
        System.out.println("2.ver calificaciones");
        System.out.println("3.ordenar calificaciones");
        System.out.println("4.eliminar calificacion");
        System.out.println("5.salir");



        System.out.print("seleccione una:");
        opcion=sc.nextInt();
        int aux;

        
       switch (opcion) {
        case 1:
            
    
            for (int i=0;i<calificaciones.length;i++){
            
            System.out.println("ingrese calificaciones:"+(i+1));
            calificaciones [i]=sc.nextInt();

            System.out.println("guardadas");
    }
            
        break;
        case 2:
              for (int i=0;i<calificaciones.length;i++){
                System.out.println(calificaciones[i]);

              }


        break;
        case 3:
          System.out.println("(1)creciente o (2)decreciente?");
          opcion1=sc.nextInt();
          if (opcion1==1){
            for(int i =0; i<calificaciones.length-1;i++){
                for (int j=0; j<calificaciones.length-1;j++){
                    if (calificaciones[j]> calificaciones[j+1]){
                        aux = calificaciones[j];
                        calificaciones[j] = calificaciones[j+1];
                        calificaciones[j+1]=aux;


                    }


                }

            }
            System.out.println("calificaciones ordenadas en forma creciente");
          }
          else if( opcion1==2){
             for (int i = 0; i < calificaciones.length - 1; i++) {
            for (int j = 0; j < calificaciones.length - 1 - i; j++) {
                if (calificaciones[j] < calificaciones[j + 1]) {
                    aux = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = aux;
                }
            }
        }
        System.out.println("Calificaciones ordenadas en forma decreciente.");
    } else {
        System.out.println("Opción no válida.");
    }
        break;
        case 4: 
        
        break;
       
       
       }
    }while(opcion!=5);}}