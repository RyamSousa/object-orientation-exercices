package main.question35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Schedule mySchedule = new Schedule(5);

        mySchedule.setSchedule(1, 1, 2022, "Dentista", 0);
        mySchedule.setSchedule(1, 5, 2022, "Mercado", 1);
        mySchedule.setSchedule(5, 2, 2022, "Dentista", 2);
        mySchedule.setSchedule(5, 2, 2022, "Dentista", 3);
        mySchedule.setSchedule(2, 2, 2022, "Dentista", 4);

        System.out.println("Digite o dia, mês e ano de uma das datas a seguir: ");
        System.out.println(mySchedule);
        System.out.println("Dia: ");
        int day = scanner.nextInt();
        System.out.println("Mês: ");
        int month = scanner.nextInt();
        System.out.println("Ano: ");
        int year = scanner.nextInt();

        System.out.println(mySchedule.listDay(day, month, year));

        scanner.close();
    }
}
