package main.question25;

public class Player {

    private String name;

    private int age;

    private String position;

    public Player(String name, int idade, String position) {
        this.name = name;
        this.age = idade;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
