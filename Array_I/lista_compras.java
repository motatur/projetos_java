import java.util.ArrayList;
import java.util.Scanner;

public class lista_compras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== LISTA DE COMPRAS =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Pesquisar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Listar produtos");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    while (true) {

                        System.out.print("Digite um produto (ou 'sair'): ");
                        String produto = sc.nextLine();

                        if (produto.equalsIgnoreCase("sair")) {
                            break;
                        }

                        produtos.add(produto);
                    }

                    break;

                case 2:

                    System.out.print("Digite o produto para pesquisar: ");
                    String pesquisa = sc.nextLine();

                    if (produtos.contains(pesquisa)) {

                        System.out.println("Produto encontrado!");

                    } else {

                        System.out.println("Produto não encontrado!");
                    }

                    break;

                case 3:

                    System.out.print("Digite o produto para remover: ");
                    String remover = sc.nextLine();

                    if (produtos.remove(remover)) {

                        System.out.println("Produto removido com sucesso!");

                    } else {

                        System.out.println("Produto não encontrado!");
                    }

                    break;

                case 4:

                    System.out.print("Digite o produto que deseja alterar: ");
                    String antigo = sc.nextLine();

                    int indice = produtos.indexOf(antigo);

                    if (indice != -1) {

                        System.out.print("Digite o novo nome do produto: ");
                        String novo = sc.nextLine();

                        produtos.set(indice, novo);

                        System.out.println("Produto alterado com sucesso!");

                    } else {

                        System.out.println("Produto não encontrado!");
                    }

                    break;

                case 5:

                    if (produtos.isEmpty()) {

                        System.out.println("Lista vazia!");

                    } else {

                        System.out.println("\nProdutos cadastrados:");

                        for (String produto : produtos) {

                            System.out.println("- " + produto);
                        }
                    }

                    break;

                case 6:

                    System.out.println("Programa encerrado com sucesso!");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}