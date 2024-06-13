import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abracadabra";
        System.out.println(removeDuplicates(str)); // "abrcd"
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
