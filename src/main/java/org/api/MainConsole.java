package org.api;

import java.sql.SQLException;
import java.util.Scanner;

public class MainConsole {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {


        int opcao;
        do {
            exibirMenu();
            opcao = Integer.parseInt(console.nextLine());
            switch (opcao) {
                case 0 -> salvarProduto();
                case 1 -> buscarTodosProdutos();
                case 2 -> buscarProdutoPorId();
                case 3 -> atualizarProduto();
                case 4 -> excluirProduto();
                case 5 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

    }

    private static void exibirMenu() {
        System.out.println("\n### Menu de Operações ###");
        System.out.println("0. Salvar novo produto");
        System.out.println("1. Buscar todos produtos");
        System.out.println("2. Buscar produto por ID");
        System.out.println("3. Atualizar produto");
        System.out.println("4. Excluir produto");
        System.out.println("5. Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    private static void salvarProduto(){
        System.out.println("\n### Criar Novo Produto ###");
        System.out.println("\n### Nome ###");
        String nome = console.nextLine();
        System.out.println("\n### Preço ###");
        double preco = console.nextDouble();
        console.nextLine();
        System.out.println("\n### descrição ###");
        String descricao = console.nextLine();
        System.out.println("\n### Link ###");
        String link = console.nextLine();
        System.out.println("\n### Linlk da Imagem ###");
        String img = console.nextLine();


        Produto produto = new Produto(nome , preco , link , descricao,img);
        ProdutoDAO produtoDAO = new ProdutoDAO();

        try {
            produtoDAO.salvar(produto);
            System.out.println("produto salvo");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //TODO- Implementar buscar todos

    }

    private static void buscarTodosProdutos() {
        System.out.println("\n### Buscar Todos ###");

        //TODO- Implementar buscar todos
    }

    private static void buscarProdutoPorId() {
        System.out.println("\n### Buscar Produto por ID ###");

        //TODO- Implementar busca por id
    }

    private static void atualizarProduto() {
        System.out.println("\n### Atualizar Produto ###");

        //TODO- Implementar atualizar
    }

    private static void excluirProduto() {
        System.out.println("\n### Excluir Produto ###");

        //TODO- Implementar excluir
    }
}