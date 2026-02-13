import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.println("Enter the first word:");
        String word1 = sc.nextLine().trim();

        // Validate first word
        if (!isSingleWord(word1)) {
            System.out.println(word1 + " is an invalid word");
            return;  // Early return (safe termination)
        }

        System.out.println("Enter the second word:");
        String word2 = sc.nextLine().trim();

        // Validate second word
        if (!isSingleWord(word2)) {
            System.out.println(word2 + " is an invalid word");
            return;  // Early return (safe termination)
        }

        System.out.println("Both words are valid single words.");
    }

    // Method to check if input contains only one word
    private static boolean isSingleWord(String input) {
        return !input.contains(" ") && !input.isEmpty();
    }
}
