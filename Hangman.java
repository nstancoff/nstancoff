package Misc;
import java.util.Scanner; import java.util.ArrayList;
public class Hangman {
    static String getWord(String[] array) {
        int x = (int) (Math.random() * 10);
        return array[x];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> chars_used = new ArrayList<>();
        ArrayList<Character> chars_correct = new ArrayList<>();
        String[] wordArray = new String[10];
        wordArray[0] = "science";
        wordArray[1] = "mathematics";
        wordArray[2] = "sociology";
        wordArray[3] = "rhinoceros";
        wordArray[4] = "elephant";
        wordArray[5] = "leopard";
        wordArray[6] = "kicking";
        wordArray[7] = "cheating";
        wordArray[8] = "helpful";
        wordArray[9] = "braggart";

        String word = getWord(wordArray);
        int attempt = 0;

        for (int i = 0; i < word.length(); i++) {
            chars_used.add(word.charAt(i));
            System.out.print("_ ");
            if (i == word.length() - 1) {
                System.out.println();
            }
        }

        while (true) {
            System.out.println("Enter a letter: ");
            char char_in = in.next().charAt(0);
            if (chars_used.contains(char_in)) {
                System.out.println("Correct!");
                chars_correct.add(char_in);
                for (int i = 0; i < word.length(); i++) {
                    if (chars_correct.contains(word.charAt(i))) {
                        for (Character character : chars_correct) {
                            if (word.charAt(i) == character) {
                                System.out.print(word.charAt(i) + " ");
                                if (i == word.length() - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else {
                        System.out.print("_ ");
                        if (i == word.length() - 1) {
                            System.out.println();
                        }
                    }
                }
            } else {
                attempt++;
                System.out.println("Incorrect.");
                if (attempt == 5) {
                    System.out.println("Maximum attempts reached.");
                    System.out.println("The correct word was " + word + ".");
                    break;
                }
            }
            System.out.println("Would you like to try the full word? Y/N: ");
            String yes_no = in.next();
            if (yes_no.equalsIgnoreCase("y")) {
                System.out.println("Enter the full word: ");
                String final_word = in.next();
                if (final_word.equalsIgnoreCase(word)) {
                    System.out.println("You Win!");
                    break;
                }
            }
        }
    }
}
