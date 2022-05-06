package main.question38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do evento: ");
        String evento = scanner.next();
        System.out.println("Digite uma data válida para o evento: ");
        String data = scanner.next();
        System.out.println("Digite um horário válido para o evento: ");
        String horario = scanner.next();

        EventoDelegacao eventoDelegacao = new EventoDelegacao(new DataHora(data, horario), evento);
        EventoHeranca eventoHeranca = new EventoHeranca(data, horario, evento);

        System.out.println(eventoHeranca);
        System.out.println(eventoDelegacao);

        scanner.close();
    }
}
