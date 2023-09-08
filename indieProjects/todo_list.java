import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nLista de Tarefas:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            System.out.println("\nOpções:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Excluir tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o caractere de nova linha após a leitura do número

            switch (choice) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.print("Digite o número da tarefa concluída: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Tarefa marcada como concluída.");
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa a ser excluída: ");
                    int taskToDelete = scanner.nextInt();
                    if (taskToDelete >= 1 && taskToDelete <= tasks.size()) {
                        tasks.remove(taskToDelete - 1);
                        System.out.println("Tarefa excluída.");
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo da lista de tarefas.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
