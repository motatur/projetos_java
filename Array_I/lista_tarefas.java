import java.util.ArrayList;
import java.util.Scanner;

public class lista_tarefas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {

            System.out.print("Digite uma tarefa (ou 'fim' para encerrar): ");
            String tarefa = sc.nextLine();

            if (tarefa.equalsIgnoreCase("fim")) {
                break;
            }

            tarefas.add(tarefa);
        }

        System.out.println("\nLista de tarefas:");

        for (String tarefa : tarefas) {

            System.out.println("- " + tarefa);
        }

        sc.close();
    }
}