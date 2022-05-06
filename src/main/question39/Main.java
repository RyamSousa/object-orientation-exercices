package main.question39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados da livraria");
        System.out.println("Digite o nome do livro:");
        String nome = scanner.next();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.next();
        System.out.println("Digite o quantidade de livros em estoque:");
        int qtd = scanner.nextInt();

        LivroLivraria livroLivraria = new LivroLivraria(nome, autor, qtd);

        System.out.println("Dados da Biblioteca");
        System.out.println("Digite o nome do livro:");
        nome = scanner.next();
        System.out.println("Digite o autor do livro:");
        autor = scanner.next();
        System.out.println("Digite o nome do dono da biblioteca:");
        String dono = scanner.next();

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca(nome, autor, dono);

        System.out.println(livroLivraria);
        System.out.println(livroBiblioteca);

        scanner.close();
    }
}
