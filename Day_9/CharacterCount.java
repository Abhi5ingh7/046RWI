public class CharacterCount {
    public static void main(String[] args) {
        String input = "AbhishekSingh";

        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        // Convert the input string to a char array and iterate through each character
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            }
        }

        // Print the total count of lowercase and uppercase characters
        System.out.println("Total number of lowercase characters: " + lowerCaseCount);
        System.out.println("Total number of uppercase characters: " + upperCaseCount);
    }
}
