import java.util.Scanner;

public class GerenciamentoBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Revista");
            System.out.println("3. Listar Itens");
            System.out.println("4. Emprestar Item");
            System.out.println("5. Devolver Item");
            System.out.println("6. Sair");

            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    biblioteca.adicionarItem(new Livro(tituloLivro, autor));
                    System.out.println("Livro adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o título da revista: ");
                    String tituloRevista = scanner.nextLine();
                    System.out.print("Digite a edição da revista: ");
                    int edicao = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    biblioteca.adicionarItem(new Revista(tituloRevista, edicao));
                    System.out.println("Revista adicionada com sucesso.");
                    break;
                case 3:
                    System.out.println("Listando todos os itens:");
                    biblioteca.listarItens();
                    break;
                case 4:
                    System.out.print("Digite o título do item a ser emprestado: ");
                    String tituloEmprestimo = scanner.nextLine();
                    Item itemEmprestimo = biblioteca.buscarItem(tituloEmprestimo);
                    if (itemEmprestimo != null) {
                        try {
                            itemEmprestimo.emprestar();
                            System.out.println("Item emprestado com sucesso.");
                        } catch (ItemNaoDisponivelException e) {
                            System.err.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o título do item a ser devolvido: ");
                    String tituloDevolucao = scanner.nextLine();
                    Item itemDevolucao = biblioteca.buscarItem(tituloDevolucao);
                    if (itemDevolucao != null) {
                        itemDevolucao.devolver();
                        System.out.println("Item devolvido com sucesso.");
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
            System.out.println();
        }
    }
}
