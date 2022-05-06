package main.question27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite a matricula do aluno: ");
        int matricula = scanner.nextInt();
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.println("Digite a nota do trabalho do aluno: ");
        double trabalho = scanner.nextDouble();
        System.out.println("Digite a nota da prova 1 do aluno: ");
        double prova1 = scanner.nextDouble();
        System.out.println("Digite a nota da prova 2 do aluno: ");
        double prova2 = scanner.nextDouble();

        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setNotaTrabalho(trabalho);
        aluno.setNotaProva1(prova1);
        aluno.setNotaProva2(prova2);

        System.out.println("Matricula: "+aluno.getMatricula());
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Media do aluno: "+aluno.media());
        System.out.println("Quanto precisa para a prova final: "+aluno.provaFinal());

        scanner.close();
    }
}
