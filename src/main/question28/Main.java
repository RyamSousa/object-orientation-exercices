package main.question28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        Elevador elevador = new Elevador();

        System.out.println("Digite a capacidade máxima de pessoas que o elevador pode suportar: ");
        int capacityPeoples = scanner.nextInt();
        System.out.println("Digite a capacidade máxima de andares que o elevador irá percorrer: ");
        int amountFloors = scanner.nextInt();

        elevador.inicialize(capacityPeoples, amountFloors);
        System.out.println(elevador.toString());

        // Elevador subindo
        while (i < amountFloors){
            System.out.println("\nAndar atual: \n"+i);
            if(elevador.getCurrentQuantityPeoples() < elevador.getCapacityPeoples()){
                System.out.println("Digite quantas pessoas entrarão agora: ");
                int peoples = scanner.nextInt();
                boolean enter = elevador.enter(peoples);

                if (enter) System.out.println(peoples+" entraram.");
                else System.out.println(peoples+" número de pessoas superior a capaciade atual do elevador.");
                System.out.println(elevador.toString());
            }

            elevador.moveUp();
            i++;
        }

        // Elevador descendo
        while (i > 0){
            System.out.println("\nAndar atual: \n"+i);
            if(elevador.getCurrentQuantityPeoples() > 0){
                System.out.println("Digite quantas pessoas sairão agora: ");
                int peoples = scanner.nextInt();
                boolean exit = elevador.exit(peoples);

                if (exit) System.out.println(peoples+" sairam.");
                else System.out.println(peoples+" número de pessoas inferior a quantidade atual no elevador.");
                System.out.println(elevador.toString());
            }

            elevador.moveDown();
            i--;
        }

        System.out.println(elevador.toString());
    }
}
