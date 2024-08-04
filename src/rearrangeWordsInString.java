import java.util.*;

public class rearrangeWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: "); // Welcome To This Interview
        String input = scanner.nextLine();
        
        String output = rearrangeWords(input);
        System.out.println("Output: " + output);
    }
    
    public static String rearrangeWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Rearrange the words
        StringBuilder rearranged = new StringBuilder();
        rearranged.append(words[1]);  // Append the second word
        rearranged.append(" ");
        rearranged.append(words[2]);  // Append the third word
        rearranged.append(" ");
        rearranged.append(words[0]);  // Append the first word
        rearranged.append(" ");
        rearranged.append(words[3]);  // Append the fourth word
       // rearranged.substring(0, 6);
        // If there are more words, append them too
        for (int i = 4; i < words.length; i++) {
            rearranged.append(" ");
            rearranged.append(words[i]);
        }
        
        return rearranged.toString();
    }
}
