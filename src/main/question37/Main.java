package main.question37;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        int i = 1;

        System.out.println("Digite um id negativo para sair");
        while (true){
            System.out.println("Digite o id do cliente "+i+": ");
            int id = scanner.nextInt();
            if (id < 0){
                break;
            }
            System.out.println("Digite o nome do cliente "+i+": ");
            String nome = scanner.next();
            System.out.println("Digite a idade do cliente "+i+": ");
            int idade = scanner.nextInt();
            System.out.println("Digite o telefone do cliente "+i+": ");
            String telefone = scanner.next();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);
            i++;
        }

        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
    }
}
