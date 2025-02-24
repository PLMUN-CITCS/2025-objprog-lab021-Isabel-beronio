import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Use nextLine() to read the whole sentence

        int wordCount = countWords(sentence);

        System.out.println("The sentence has " + wordCount + " words.");
        scanner.close();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0; // Handle empty or null input
        }

        String[] words = sentence.split("\\s+"); // Split by any whitespace (including multiple spaces)
        return words.length;
    }
}