import java.util.Scanner;

public class WordCounter {
    public static int countWords(String text) {
        // Remove leading and trailing whitespace
        text = text.trim();

        // If the text is empty, return 0
        if (text.isEmpty()) {
            return 0;
        }

        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");

        // Return the number of words
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Counter");
        System.out.println("Enter your text:");
        String inputText = scanner.nextLine();

        int wordCount = countWords(inputText);
        System.out.println("Word count: " + wordCount);

        scanner.close();
    }
}
