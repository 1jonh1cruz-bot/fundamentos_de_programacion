import java.util.*;

public class SIstema_estudiantes {
    public static void main(String[] args) { 
        Scanner ed = new Scanner(System.in);

        List<String> matricula = new LinkedList<>();
        List<String> nombre = new LinkedList<>();
        List<Double> calificacion = new LinkedList<>();

        int op = 0;

        System.out.println("========= SISTEMA DE ADMINISTRACION DE ESTUDIANTES ============\n");

        do {
            mostrarMenu();
            op = ed.nextInt();

            switch (op) {
                case 1:
                    int existe = 0;
                    do {
                        System.out.print("\nMatricula: ");
                        String matri = ed.next();

                        if (matricula.contains(matri)) {
                            System.out.println("\nMatricula existente\n");      
                            existe = -1;
                        } else {
                            matricula.add(matri);
                            existe = 0;
                            break;
                        }
                    } while (existe == -1);

                    System.out.print("Nombre: ");
                    String nom = ed.next();
                    nombre.add(nom);

                    System.out.print("Calificacion: ");
                    Double cali = ed.nextDouble();
                    calificacion.add(cali);
                    break;
                
                case 2: 
                    System.out.println("\nAlumnos, de forma ordenada: \n");

                    if (nombre.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.\n");
                        break;
                    }

                    List<Integer> indices = new LinkedList<>();
                    for (int i = 0; i < nombre.size(); i++) {
                        indices.add(i);
                    }

                    indices.sort((i1, i2) -> nombre.get(i1).compareToIgnoreCase(nombre.get(i2)));

                    for (int i : indices) {
                        System.out.println("Matricula: " + matricula.get(i) + 
                                           " | Nombre: " + nombre.get(i) + 
                                           " | Calificacion: " + calificacion.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la matricula: ");
                    String matri = ed.next();

                    int indice = matricula.indexOf(matri);

                    if (indice == -1) {
                        System.out.println("Alumno no encontrado\n");
                    } else {
                        System.out.println("Nombre: " + nombre.get(indice));
                        System.out.println("Matricula: " + matricula.get(indice));
                        System.out.println("Calificacion: " + calificacion.get(indice) + "\n");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la matricula: ");
                    matri = ed.next();

                    if (matricula.contains(matri)) {
                        indice = matricula.indexOf(matri);
                        System.out.print("Nueva calificacion: ");
                        Double nueva_c = ed.nextDouble();

                        calificacion.set(indice, nueva_c);
                        System.out.println("Calificacion actualizada con exito.\n");
                    } else {
                        System.out.println("Alumno no encontrado\n");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la matricula: ");
                    matri = ed.next();

                    indice = matricula.indexOf(matri);

                    if (indice != -1) {
                        matricula.remove(indice);
                        nombre.remove(indice);
                        calificacion.remove(indice);
                        System.out.println("Eliminado con exito\n");
                    } else {
                        System.out.println("Alumno no encontrado!\n");
                    }
                    break;

                case 6:
                    if (calificacion.isEmpty()) {
                        System.out.println("No hay calificaciones registradas.\n");
                        break;
                    }
                    
                    int longitud = calificacion.size();
                    Double promedio_general = 0.0; 
                    double suma = 0;

                    for (Double calificaciones : calificacion) {
                        suma = suma + calificaciones;       
                    }
                    promedio_general = suma / longitud;
                    System.out.println("\nEl promedio general del grupo es: " + promedio_general + "\n");
                    break;
                
                case 7:
                    if (calificacion.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.\n");
                        break;
                    }

                    System.out.println("\nCalificacion mayor y menor:\n");

                    int indexMax = 0;
                    int indexMin = 0;

                    for (int i = 1; i < calificacion.size(); i++) {
                        if (calificacion.get(i) > calificacion.get(indexMax)) {
                            indexMax = i;
                        }
                        if (calificacion.get(i) < calificacion.get(indexMin)) {
                            indexMin = i;
                        }
                    }

                    System.out.println("--- CALIFICACION MAYOR ---");
                    System.out.println("Matricula: " + matricula.get(indexMax) + " | Nombre: " + nombre.get(indexMax) + " | Calificacion: " + calificacion.get(indexMax));
                    
                    System.out.println("\n--- CALIFICACION MENOR ---");
                    System.out.println("Matricula: " + matricula.get(indexMin) + " | Nombre: " + nombre.get(indexMin) + " | Calificacion: " + calificacion.get(indexMin) + "\n");
                    break;
                        
                case 8:
                    System.out.println("\nEstudiantes con promedio mayor a 9:\n");
                    boolean encontrados = false;

                    for (int i = 0; i < calificacion.size(); i++) {
                        if (calificacion.get(i) > 9.0) {
                            System.out.println("Matricula: " + matricula.get(i) + 
                                               " | Nombre: " + nombre.get(i) + 
                                               " | Calificacion: " + calificacion.get(i));
                            encontrados = true;
                        }
                    }

                    if (!encontrados) {
                        System.out.println("No hay estudiantes con calificacion mayor a 9.");
                    }
                    System.out.println();
                    break;

                case 9: 
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida!\n");
                    break;
            }

        } while (op != 9);
        ed.close();
    }

    static void mostrarMenu() {
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Mostrar estudiantes alfabeticamente");
        System.out.println("3. Buscar estudiante por matricula");
        System.out.println("4. Modificar calificacion");
        System.out.println("5. Eliminar estudiante");
        System.out.println("6. Promedio general");
        System.out.println("7. Calificacion mayor y menor");
        System.out.println("8. Estudiantes con promedio mayor a 9");
        System.out.println("9. Salir\n");
        System.out.print("Selecciona una opcion: ");
    }
}