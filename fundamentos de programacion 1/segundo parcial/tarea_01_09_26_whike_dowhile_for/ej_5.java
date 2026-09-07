import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        String signo = "";

        switch (mes) {
            case 1: // Enero
                signo = (dia <= 19) ? "Capricornio" : "Acuario";
                break;
            case 2: // Febrero
                signo = (dia <= 18) ? "Acuario" : "Piscis";
                break;
            case 3: // Marzo
                signo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4: // Abril
                signo = (dia <= 19) ? "Aries" : "Tauro";
                break;
            case 5: // Mayo
                signo = (dia <= 20) ? "Tauro" : "Géminis";
                break;
            case 6: // Junio
                signo = (dia <= 20) ? "Géminis" : "Cáncer";
                break;
            case 7: // Julio
                signo = (dia <= 22) ? "Cáncer" : "Leo";
                break;
            case 8: // Agosto
                signo = (dia <= 22) ? "Leo" : "Virgo";
                break;
            case 9: // Septiembre
                signo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10: // Octubre
                signo = (dia <= 22) ? "Libra" : "Escorpio";
                break;
            case 11: // Noviembre
                signo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12: // Diciembre
                signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Mes no válido";
                break;
        }

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            System.out.println("Tu signo del zodíaco es: " + signo);
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }

        scanner.close();
    }
}