package main.question29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();
        int i = 1;

        while (i != 0){
            System.out.println("1 - incrementar\n2 - zerar\n3  - imprimir\n0 - sair");
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    contador.incrementar();
                    break;
                case 2:
                    contador.zerar();
                    break;
                case 3:
                    contador.imprimir();
                    break;
                default:
                    contador.zerar();
                    i = 0;
                    break;
            }
        }

        scanner.close();
    }
}
