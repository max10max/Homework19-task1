import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (map.containsKey(ch)) {
                    int value = map.get(ch);
                    value++;
                    map.put(ch, value);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(maxQuantity(map));
        System.out.println(minQuantity(map));
    }

    static public String maxQuantity(Map<Character, Integer> map) {
        int maxValue = 0;
        Character maxCh = null;
        for (Map.Entry<Character, Integer> mapForMax : map.entrySet()) {
            if (mapForMax.getValue() > maxValue) {
                maxValue = mapForMax.getValue();
                maxCh = mapForMax.getKey();
            }
        }
        return "Больше всего встречался символ " + maxCh + " c количеством повторений  " + maxValue;
    }

    static public String minQuantity(Map<Character, Integer> map) {
        int minValue = Integer.MAX_VALUE;
        Character minCh = null;
        for (Map.Entry<Character, Integer> mapForMin : map.entrySet()) {
            if (mapForMin.getValue() < minValue) {
                minValue = mapForMin.getValue();
                minCh = mapForMin.getKey();
            }
        }
        return "Меньше всего встречался символ " + minCh + " c количеством повторений  " + minValue;
    }
}
