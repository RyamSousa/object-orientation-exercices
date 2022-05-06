package main.question40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Governador:");
        String nome = scanner.next();
        System.out.println("Digite a idade do Governador:");
        int idade = scanner.nextInt();
        System.out.println("Digite o partido do Governador");
        String partido = scanner.next();
        System.out.println("Digite o estado do Governador");
        String estado = scanner.next();

        Governador governador = new Governador(nome, idade, partido, estado);

        System.out.println("Digite o nome do Prefeito:");
        nome = scanner.next();
        System.out.println("Digite a idade do Prefeito:");
        idade = scanner.nextInt();
        System.out.println("Digite o partido do Prefeito");
        partido = scanner.next();
        System.out.println("Digite o estado do Prefeito");
        estado = scanner.next();

        Prefeito prefeito = new Prefeito(nome, idade, partido, estado);

        System.out.println(governador);
        System.out.println(prefeito);

        scanner.close();
    }
}
