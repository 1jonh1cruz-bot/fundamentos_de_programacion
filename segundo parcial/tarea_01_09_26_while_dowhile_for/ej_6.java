import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcionRepetir = ""; // Se declara FUERA del do-while

        do {
            System.out.print("Ingrese el día de la semana (1-7): ");
            int diaSemana = entrada.nextInt();

            System.out.print("Ingrese el número de boletos a comprar: ");
            int cantidadBoletos = entrada.nextInt();

            // Asignación de tarifa base según el día
            double precioUnitario = (diaSemana == 3) ? 30.0 : 50.0;

            System.out.print("¿Cuenta con membresía? (s/n): ");
            String tieneMembresia = entrada.next().toLowerCase();

            // Aplicar descuento por membresía
            if (tieneMembresia.equals("s")) {
                precioUnitario *= 0.90;
            }

            double montoTotal = 0.0;

            // Manejo de la promoción especial del día 4 (Jueves)
            if (diaSemana == 4) {
                if (!tieneMembresia.equals("s") && !tieneMembresia.equals("n")) {
                    System.out.println("no valido");
                    System.out.print("\n¿Desea volver a intentar? (s/n): ");
                    opcionRepetir = entrada.next().toLowerCase();
                    continue;
                }

                int boletosIndividuales = cantidadBoletos % 2;
                int parejas = cantidadBoletos / 2;

                double costoIndividuales = boletosIndividuales * precioUnitario;
                double costoParejas = parejas * 75.0;

                if (tieneMembresia.equals("s")) {
                    costoParejas *= 0.90;
                }

                montoTotal = costoIndividuales + costoParejas;
            } else if (diaSemana >= 1 && diaSemana <= 7) {
                montoTotal = cantidadBoletos * precioUnitario;
            } else {
                System.out.println("no existe");
                System.out.print("\n¿Desea volver a intentar? (s/n): ");
                opcionRepetir = entrada.next().toLowerCase();
                continue;
            }

            System.out.println("total es:" + montoTotal);

            System.out.print("\n¿Desea realizar otra compra? (s/n): ");
            opcionRepetir = entrada.next().toLowerCase();

        } while (opcionRepetir.equals("s"));

        System.out.println("Programa finalizado.");
        entrada.close();
    }
}