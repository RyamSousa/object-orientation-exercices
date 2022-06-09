package main.question46;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Operations {

    public static Map<String, Integer> getOccurring(String[] characters) {
        Map<String, Integer> map = new HashMap<>();

        for (String character : characters) {
            String characterOnLowerCase = character.toUpperCase();
            if (map.containsKey(characterOnLowerCase)) {
                int num = map.get(characterOnLowerCase);
                map.put(characterOnLowerCase, num + 1);
            } else {
                map.put(characterOnLowerCase, 1);
            }
        }

        return map;
    }

    public static void printOccurring(Map<String, Integer> map){
        Set<String> treeSetCharacters = new TreeSet<>(map.keySet());
        for (String treeSetCharacter : treeSetCharacters) {
            if (!treeSetCharacter.equals(" "))
                System.out.printf("%s\t%s%n", treeSetCharacter, map.get(treeSetCharacter));
        }
    }
}
