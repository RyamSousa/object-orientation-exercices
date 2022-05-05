package main.question34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int op = 1;

        while (op != 0){
            System.out.println("Escolha uma opção operação");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("0 - divisão");
            op = scanner.nextInt();

            System.out.println("Digite o número 1: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite o número 2: ");
            int num2 = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Resultado: "+calculator.sum(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: "+calculator.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: "+calculator.multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: "+calculator.division(num1, num2));
                    break;
                default:
                    op = 0;
            }
        }

        scanner.close();
    }
}
