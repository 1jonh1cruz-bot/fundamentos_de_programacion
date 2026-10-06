import java.util.Scanner;

public class Matricescomputadoras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vendedores: ");
        int vendedores = sc.nextInt();
        System.out.print("Ingrese las zonas: ");
        int zonas = sc.nextInt();

        // Solicitamos el precio unitario para poder calcular el monto total de venta
        System.out.print("Ingrese el precio unitario por computadora ($): ");
        double precioPorComputadora = sc.nextDouble();

        int arreglo[][] = new int[vendedores][zonas];

        // Llenado de la matriz
        for (int i = 0; i < vendedores; i++) {
            for (int j = 0; j < zonas; j++) {
                System.out.print("Cantidad de computadoras vendidas por el vendedor " + (i + 1) + " en la zona " + (j + 1) + ": ");
                arreglo[i][j] = sc.nextInt();
            }
        }

        // Mostrar la matriz ingresada
        System.out.println("\nMatriz actual:");
        for (int i = 0; i < vendedores; i++) {
            for (int j = 0; j < zonas; j++) {
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println();
        }

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE MATRICES ---");
            System.out.println("1. La zona que más computadoras vendió.");
            System.out.println("2. El vendedor que menos computadoras vendió, cuántas y de cuánto fue su venta.");
            System.out.println("3. El vendedor que más computadoras vendió, cuántas y de cuánto fue su venta.");
            System.out.println("4. La cantidad de computadoras vendidas por todos los vendedores en todas las zonas.");
            System.out.println("5. Salir.");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Zona que más computadoras vendió (suma de columnas)
                    int maxVentasZona = -1;
                    int zonaMasVentas = -1;

                    for (int j = 0; j < zonas; j++) {
                        int sumaZona = 0;
                        for (int i = 0; i < vendedores; i++) {
                            sumaZona += arreglo[i][j];
                        }

                        if (sumaZona > maxVentasZona) {
                            maxVentasZona = sumaZona;
                            zonaMasVentas = j + 1; // Para mostrar desde zona 1
                        }
                    }

                    System.out.println("\n-> La zona que más computadoras vendió fue la Zona " + zonaMasVentas + " con un total de " + maxVentasZona + " unidades.");
                    break;

                case 2:
                    // Vendedor que menos computadoras vendió (suma de filas)
                    int minVentasVendedor = Integer.MAX_VALUE;
                    int vendedorMenosVentas = -1;

                    for (int i = 0; i < vendedores; i++) {
                        int sumaVendedor = 0;
                        for (int j = 0; j < zonas; j++) {
                            sumaVendedor += arreglo[i][j];
                        }

                        if (sumaVendedor < minVentasVendedor) {
                            minVentasVendedor = sumaVendedor;
                            vendedorMenosVentas = i + 1; // Para mostrar desde vendedor 1
                        }
                    }

                    double montoVentaMenor = minVentasVendedor * precioPorComputadora;
                    System.out.println("\n-> El vendedor que menos computadoras vendió fue el Vendedor " + vendedorMenosVentas + ".");
                    System.out.println("   Cantidad vendida: " + minVentasVendedor + " unidades.");
                    System.out.println("   Monto total de venta: $" + montoVentaMenor);
                    break;

                case 3:
                    // Vendedor que más computadoras vendió (suma de filas)
                    int maxVentasVendedor = -1;
                    int vendedorMasVentas = -1;

                    for (int i = 0; i < vendedores; i++) {
                        int sumaVendedor = 0;
                        for (int j = 0; j < zonas; j++) {
                            sumaVendedor += arreglo[i][j];
                        }

                        if (sumaVendedor > maxVentasVendedor) {
                            maxVentasVendedor = sumaVendedor;
                            vendedorMasVentas = i + 1;
                        }
                    }

                    double montoVentaMayor = maxVentasVendedor * precioPorComputadora;
                    System.out.println("\n-> El vendedor que más computadoras vendió fue el Vendedor " + vendedorMasVentas + ".");
                    System.out.println("   Cantidad vendida: " + maxVentasVendedor + " unidades.");
                    System.out.println("   Monto total de venta: $" + montoVentaMayor);
                    break;

                case 4:
                    // Cantidad total de computadoras vendidas
                    int totalGeneral = 0;
                    for (int i = 0; i < vendedores; i++) {
                        for (int j = 0; j < zonas; j++) {
                            totalGeneral += arreglo[i][j];
                        }
                    }

                    System.out.println("\n-> La cantidad total de computadoras vendidas por todos los vendedores en todas las zonas es: " + totalGeneral + " unidades.");
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}