import java.util.HashMap;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char current = magazine.charAt(i);
            charCount.put(current, charCount.getOrDefault(current, 0) + 1);
        }


        for (char current : ransomNote.toCharArray()) {
            if (!(charCount.containsKey(current)) || charCount.get(current) == 0) {
                return false;
            } else {
                charCount.put(current, charCount.get(current) - 1);
            }
        }

        return true;
    }
}
