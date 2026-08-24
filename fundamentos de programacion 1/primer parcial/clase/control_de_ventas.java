import java.util.Scanner;

public class control_de_ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        
        int cant_mayores_1000 = 0;
        int cant_500_1000 = 0;
        int cant_menores_500 = 0;

        double total_mayores_1000 = 0;
        double total_500_1000 = 0;
        double total_menores_500 = 0;
        double total_global = 0;

        int i = 1;

        System.out.println("hay ventas?");
        String si_no = sc.next();

        
        if (si_no.equalsIgnoreCase("si")) {

            System.out.println("ingrese el numero total de ventas:");
            int N = sc.nextInt();

            while (i <= N) {
                System.out.println("Ingrese el monto de la venta :" + i);
                double monto_venta = sc.nextDouble();

                if (monto_venta > 1000) {
                    cant_mayores_1000 = cant_mayores_1000 + 1;
                    total_mayores_1000 = total_mayores_1000 + monto_venta;
                } else if (monto_venta > 500) {
                    cant_500_1000 = cant_500_1000 + 1;
                    total_500_1000 = total_500_1000 + monto_venta;
                } else {
                    cant_menores_500 = cant_menores_500 + 1;
                    total_menores_500 = total_menores_500 + monto_venta;
                }

                total_global = total_global + monto_venta;
                i = i + 1;
            }

            System.out.println("============================================");
            System.out.println("            RESUMEN DE VENTAS DEL DÍA        ");
            System.out.println("============================================");
            System.out.println("1. Ventas mayores a $1000:");
            System.out.println("   - Cantidad de ventas: " + cant_mayores_1000);
            System.out.println("   - Monto acumulado: $" + total_mayores_1000);

            System.out.println("2. Ventas mayores a $500 pero menores o iguales a $1000:");
            System.out.println("   - Cantidad de ventas: " + cant_500_1000);
            System.out.println("   - Monto acumulado: $" + total_500_1000);

            System.out.println("3. Ventas menores o iguales a $500:");
            System.out.println("   - Cantidad de ventas: " + cant_menores_500);
            System.out.println("   - Monto acumulado: $" + total_menores_500);
            System.out.println("--------------------------------------------");
            System.out.println("MONTO TOTAL VENDIDO DE FORMA GLOBAL: $" + total_global);

        } 

        sc.close();
    }
}