package kodar.internship;

import java.util.HashMap;

public class CharFinder {
    public void findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCounter = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            str = str.toLowerCase();
            char character = str.charAt(i);
            if (charCounter.containsKey(character)) {
                charCounter.put(character, charCounter.get(character) + 1);
            } else {
                charCounter.put(character, 1);
            }
        }
        System.out.println(charCounter);
    }
}
