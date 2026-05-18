import java.util.Scanner;

public class lista_de_convidados{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] convidados = new String[5];

// Cadastro dos convidados
        for (int i = 0; i < convidados.length; i++) {

            System.out.print("Digite o nome do convidado " + (i + 1) + ": ");
            convidados[i] = sc.nextLine();
        }

        // Exibição dos convidados
        System.out.println("\nLista de convidados:");

        for (int i = 0; i < convidados.length; i++) {

            System.out.println((i + 1) + " - " + convidados[i]);
        }

        // Quantidade de convidados
        System.out.println("\nQuantidade de convidados: " + convidados.length);




    sc.close();
} 

    
}