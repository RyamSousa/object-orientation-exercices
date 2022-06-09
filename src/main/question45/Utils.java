package main.question45;

import java.util.LinkedList;
import java.util.List;

public class Utils {

    public static List<String> reverseList(List<String> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }

        return list;
    }
}
