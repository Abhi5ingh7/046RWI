import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "AbhishekSingh";

        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Convert the input string to a char array and iterate through each character
        for (char c : input.toCharArray()) {
            // If the character is already in the HashMap, increment its count
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                // If the character is not in the HashMap, add it with a count of 1
                charFrequency.put(c, 1);
            }
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
