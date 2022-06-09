package main.question45;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] characters = {"a", "b", "c", "d", "e", "f", "h", "i", "j"};
        List<String> charactersList = new LinkedList<>(Arrays.asList(characters));
        List<String> charactersListCopy = new LinkedList<>(charactersList);

        charactersListCopy = Utils.reverseList(charactersListCopy);

        System.out.println("Original List: " + charactersList);
        System.out.println("Reverse List: " + charactersListCopy);
    }
}
