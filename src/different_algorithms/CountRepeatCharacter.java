package different_algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatCharacter {
    public static void main(String[] args) {
        String str = "Map<Character, Integer> map = countRepeatCharacters(str);";

        long start = System.nanoTime();
        Map<Character, Integer> map = countRepeatCharacters(str);
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start));
        System.out.println(map);

        System.out.println("======================");

        long start1 = System.nanoTime();
        Map<Character, Long> map2 = countDuplicateCharacters(str);
        long end1 = System.nanoTime();
        System.out.println("Time taken: " + (end1 - start1));

        System.out.println(map2);
    }

    protected static Map<Character, Integer> countRepeatCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }

        return map;
    }

    protected static Map<Character, Long> countDuplicateCharacters(String str) {

        return str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
