package different_algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatCharacter {
    public static void main(String[] args) {
        String str = "Map<Character, Integer> map = countRepeatCharacters(str);";
        Map<Character, Integer> map = countRepeatCharacters(str);
        System.out.println(map);
    }

    protected static Map<Character, Integer> countRepeatCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }

        return map;
    }
}
