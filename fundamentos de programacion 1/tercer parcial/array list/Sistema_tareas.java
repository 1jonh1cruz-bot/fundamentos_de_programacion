import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sistema_tareas {
    public static void main(String[] args) { 
        Scanner ed = new Scanner(System.in);
        List<String> identificador = new LinkedList<>();
        List<String> descripcion = new LinkedList<>();
        List<String> prioridad = new LinkedList<>();
        List<String> estado = new LinkedList<>();
        int op = 0;
        
        System.out.println("========= SISTEMA DE GESTION DE TAREAS ============\n");
        
        do {
            mostrarMenu();
            op = ed.nextInt();
            ed.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\n¿Dónde deseas agregar la tarea?");
                    System.out.println("1. Al inicio de la lista");
                    System.out.println("2. Al final de la lista");
                    System.out.print("Opción: ");
                    int lugar = ed.nextInt();
                    ed.nextLine(); 
                    
                    int existe = 0;
                    String id_tarea = "";
                    do {
                        System.out.print("\nIdentificador de la tarea: ");
                        id_tarea = ed.nextLine(); 
                        if (identificador.contains(id_tarea)) {
                            System.out.println("\nIdentificador ya existente");
                            existe = -1;
                        } else {
                            existe = 0;
                        }
                    } while (existe == -1);
                    
                    System.out.print("Descripción: ");
                    String desc = ed.nextLine();
                    System.out.print("Prioridad (alta, media, baja): ");
                    String prio = ed.nextLine();
                    
                    if (lugar == 1) {
                        identificador.add(0, id_tarea);
                        descripcion.add(0, desc);
                        prioridad.add(0, prio);
                        estado.add(0, "pendiente");
                        System.out.println("Tarea agregada al inicio");
                    } else {
                        identificador.add(id_tarea);
                        descripcion.add(desc);
                        prioridad.add(prio);
                        estado.add("pendiente");
                        System.out.println("Tarea agregada al final");
                    }
                    break;
                    
                case 2:
                    System.out.print("\nIngrese la posición (0 inicio): ");
                    int pos = ed.nextInt();
                    ed.nextLine(); // Limpiar búfer
                    
                    if (pos >= 0 && pos <= identificador.size()) {
                        System.out.print("Identificador: ");
                        String id_nueva = ed.nextLine();
                        if (identificador.contains(id_nueva)) {
                            System.out.println("El identificador ya existe ");
                        } else {
                            System.out.print("Descripción: ");
                            String desc_nueva = ed.nextLine();
                            System.out.print("Prioridad: ");
                            String prio_nueva = ed.nextLine();
                            
                            identificador.add(pos, id_nueva);
                            descripcion.add(pos, desc_nueva);
                            prioridad.add(pos, prio_nueva);
                            estado.add(pos, "pendiente");
                            System.out.println("Tarea insertada en la posición " + pos);
                        }
                    } else {
                        System.out.println("Posición no válida");
                    }
                    break;
                    
                case 3:
                    System.out.print("\nIngrese el identificador a eliminar: ");
                    String id_eliminar = ed.nextLine();
                    int indice = identificador.indexOf(id_eliminar);
                    if (indice == -1) {
                        System.out.println("Tarea no encontrada");
                    } else {
                        identificador.remove(indice);
                        descripcion.remove(indice);
                        prioridad.remove(indice);
                        estado.remove(indice);
                        System.out.println("Tarea eliminada");
                    }
                    break;
                    
                case 4:
                    System.out.print("\nIngrese la descripción a buscar: ");
                    String desc_buscar = ed.nextLine();
                    boolean encontrada = false;
                    for (int i = 0; i < descripcion.size(); i++) {
                        if (descripcion.get(i).toLowerCase().contains(desc_buscar.toLowerCase())) {
                            System.out.println("id: " + identificador.get(i) + " | desc: " + descripcion.get(i) + " | prio: " + prioridad.get(i) + " | estado: " + estado.get(i));
                            encontrada = true;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("No se encontró ninguna tarea");
                    }
                    break;
                    
                case 5:
                    System.out.println("\n--- TAREAS PENDIENTES ---");
                    int pendientes = 0;
                    for (int i = 0; i < identificador.size(); i++) {
                        if (estado.get(i).equalsIgnoreCase("pendiente")) { 
                            System.out.println("id: " + identificador.get(i) + " | desc: " + descripcion.get(i) + " | Prioridad: " + prioridad.get(i));
                            pendientes++;
                        }
                    }
                    if (pendientes == 0) {
                        System.out.println("No hay tareas pendientes");
                    }
                    break;
                    
                case 6:
                    System.out.print("\nIngrese el identificador de la tarea completada: ");
                    String id_completar = ed.nextLine();
                    indice = identificador.indexOf(id_completar);
                    if (indice == -1) {
                        System.out.println("Tarea no encontrada");
                    } else {
                        estado.set(indice, "Completada");
                        System.out.println("La tarea " + id_completar + " ha sido completada");
                    }
                    break;
                    
                case 7:
                    if (identificador.isEmpty()) {
                        System.out.println("\nLa lista de tareas está vacía");
                    } else {
                        System.out.println("\n--- PRIMERA TAREA ---");
                        System.out.println("id: " + identificador.get(0) + " | desc: " + descripcion.get(0));
                        System.out.println("--- ÚLTIMA TAREA ---");
                        int ultimo = identificador.size() - 1;
                        System.out.println("id: " + identificador.get(ultimo) + " | desc: " + descripcion.get(ultimo));
                    }
                    break;
                    
                case 8:
                    System.out.println("\n--- TAREAS EN ORDEN INVERSO ---");
                    if (identificador.isEmpty()) {
                        System.out.println("No hay tareas");
                    } else {
                        for (int i = identificador.size() - 1; i >= 0; i--) {
                            System.out.println("id: " + identificador.get(i) + " | desc: " + descripcion.get(i) + " | estado: " + estado.get(i));
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (op != 0);
        
        ed.close();
    }

    static void mostrarMenu() {
        System.out.println("\n1. Agregar tarea (al inicio o final)");
        System.out.println("2. Insertar tarea en posición específica");
        System.out.println("3. Eliminar tarea por identificador");
        System.out.println("4. Buscar tarea por descripción");
        System.out.println("5. Mostrar todas las tareas pendientes");
        System.out.println("6. Marcar tarea como completada");
        System.out.println("7. Mostrar la primera y última tarea");
        System.out.println("8. Recorrer la lista en orden inverso");
        System.out.println("0. Salir\n");
        System.out.print("Selecciona una opción: ");
    }
}

