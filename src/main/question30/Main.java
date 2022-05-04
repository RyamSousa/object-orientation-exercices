package main.question30;

import main.question29.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();
        Lampada lampada = new Lampada(contador);
        int i = 1;

        while (i != 0){
            System.out.println("1 - acender\n2 - apagar\n3 - mostrar estado\n4 - está ligada?" +
                    "\n5 - quantas vezes foi acesa?\n0 - sair");
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    lampada.acende();
                    break;
                case 2:
                    lampada.apaga();
                    break;
                case 3:
                    lampada.mostraEstado();
                    break;
                case 4:
                    System.out.println(lampada.estaLigada() ? "sim" : "não");
                    break;
                case 5:
                    lampada.totalImpressoes();
                    break;
                default:
                    i = 0;
            }
        }
    }
}
