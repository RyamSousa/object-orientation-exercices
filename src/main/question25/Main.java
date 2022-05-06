package main.question25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoccerTeam soccerTeam = new SoccerTeam();
        Scanner scanner = new Scanner(System.in);
        Player[] listPlayers = new Player[22];

        System.out.println("Digite o nome do time: ");
        String teamName = scanner.next();
        System.out.println("Digite o nome do treinador: ");
        String coachName = scanner.next();
        System.out.println("Digite a quantidade de jogadores a serem adicionados no time (max = 22): ");
        int qtd = scanner.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do jogador ("+(i+1)+"): ");
            String playerName = scanner.next();
            System.out.println("Digite a idade do jogador ("+(i+1)+"): ");
            int playerAge = scanner.nextInt();
            System.out.println("Digite a posição do jogador ("+(i+1)+"): ");
            String playerPosition = scanner.next();

            Player player = new Player(playerName, playerAge, playerPosition);
            listPlayers[i] = player;
        }

        soccerTeam.setName(teamName);
        soccerTeam.setCoach(coachName);
        soccerTeam.setPlayers(listPlayers);

        System.out.println();
        System.out.println("Nome: "+soccerTeam.getName());
        System.out.println("Treinador: "+soccerTeam.getCoach());
        System.out.println();
        System.out.println("Jogadores: ");

        for (int i = 0; i < qtd; i++) {
            System.out.println("Jogador: "+(i+1));
            System.out.println("Nome: "+listPlayers[i].getName());
            System.out.println("Idade: "+listPlayers[i].getAge());
            System.out.println("Posição: "+listPlayers[i].getPosition());
            System.out.println();
        }

        scanner.close();
    }
}
