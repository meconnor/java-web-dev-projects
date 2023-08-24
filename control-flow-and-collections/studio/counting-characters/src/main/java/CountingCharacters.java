
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Make the character lowercase for case-insensitivity
                characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}