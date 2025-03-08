public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratorio: Implementación de una lista doblemente enlazada");
        System.out.println("Presentado por: Flower Lewyn Cordoba Moreno");
        System.out.println("Rol: Estudiante");

        DoubleList taskList = new DoubleList();
        taskList.add("llevar al niño a la escuela");
        taskList.add("Trabajar");
        taskList.add("Ir al gimnasio");
        taskList.add("Estudiar UNIR");

        System.out.println("\nLista de tareas:");
        taskList.printList();

        System.out.println("Número de tareas: " + taskList.count());
        System.out.println("Tarea en posición 2: " + taskList.get(2));

        System.out.println("¿Está 'Ir al gimnasio' en la lista?: " + taskList.contains("Ir al gimnasio"));
        taskList.replace("Estudiar UNIR", "chatear");
        System.out.println("Lista después de reemplazar 'Estudiar UNIR' por 'chatear':");
        taskList.printList();
        taskList.remove("llevar al bebe a la escuela");
        System.out.println("Lista después de eliminar 'llevar al bebe a la escuela':");
        taskList.printList();

        taskList.removeAt(1);
        System.out.println("Lista después de eliminar la tarea en posición 1:");
        taskList.printList();

        // Concatenaccion otra lista de tareas
        DoubleList extraTasks = new DoubleList();
        extraTasks.add("Llamar mi madre");
        extraTasks.add("hacer la cena");
        taskList.concatenate(extraTasks);
        System.out.println("Lista después de concatenar nuevas tareas:");
        taskList.printList();
    }
}
