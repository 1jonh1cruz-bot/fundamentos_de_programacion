import java.util.Scanner;

public class cobro_telefonico {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);


       

double costobase = 0, pago = 0, impuesto = 0;
String turno = "";

	System.out.println("imgrese el tiempo de llamada(minutos):");
	double tiempo = sc.nextDouble();
	System.out.println("que dia hizo la llamada(habil/domingo):");
	String dia = sc.next();
    
	if (tiempo <=5) {
		costobase = tiempo * 1.00;
    }else if  (tiempo>5 && tiempo <= 8){
			costobase =(5*1.0)+((tiempo - 5) * 0.80);}
	else if( tiempo >8 && tiempo<=10){
				costobase= (5*1.0)+(3*0.80)+((tiempo-8)*0.70);}
	else{
		costobase=(5*1.0)+(3*0.80)+(0.70*2)+((tiempo-10)*0.50);
    }
		if (dia.equalsIgnoreCase("domingo")) {
        impuesto = (costobase * 3 / 100);
        pago = costobase + impuesto;
        System.out.println("el impuesto es de 3%:" + impuesto);
    } else {
        System.out.println("ingrese el turno(matutino/vespertino):");
        turno = sc.next();

        if (turno.equalsIgnoreCase("matutino")) {
            impuesto = (costobase * 15 / 100);
            pago = costobase + impuesto;
            System.out.println("el impuesto es de 15%:" + impuesto);
        } else if (turno.equalsIgnoreCase("vespertino")) {
            impuesto = (costobase * 10 / 100);
            pago = costobase + impuesto;
            System.out.println("el impuesto es de 10%:" + impuesto);
        }
    }
System.out.println("el costo base es de: $" + costobase);
        System.out.println("el costo total es de: $" + pago);

        sc.close();
    }
}