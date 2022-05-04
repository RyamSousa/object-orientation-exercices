package main.question25;

public class SoccerTeam {

    private String name;

    private String coach;

    private Player[] players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
