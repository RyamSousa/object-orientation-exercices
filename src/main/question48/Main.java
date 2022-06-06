package main.question48;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true){
            try {
                System.out.println("Digite o primeiro número: ");
                int num1 = calculator.obterIntValido( scanner.next());
                System.out.println("Digite o segundo número: ");
                int num2 = calculator.obterIntValido( scanner.next());

                System.out.println("Soma: "+calculator.sum(num1, num2));
                return;
            }catch (NumberFormatException exception){
                System.out.println("Valor inválido. Erro: "+ exception.getMessage());
            }
        }
    }
}
