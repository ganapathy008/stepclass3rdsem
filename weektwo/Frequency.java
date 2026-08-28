package weektwo;
import java.util.*;

public class Frequency {
    static void printFilteredWordFrequency(String feedback) {
        // Stop words list
        String[] stopWords = {"the","is","was","and","to","of","a","in"};
        Set<String> stopSet = new HashSet<>(Arrays.asList(stopWords));

        // Normalize text: lowercase + remove punctuation
        String cleaned = feedback.toLowerCase().replaceAll("[.,]", "");
        String[] words = cleaned.split("\\s+");

        // Count frequencies
        Map<String,Integer> freq = new HashMap<>();
        for (String w : words) {
            if (!stopSet.contains(w)) {
                freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
        }

        // Print top 3 words sorted by frequency
        freq.entrySet().stream()
            .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
            .limit(3)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feedback paragraph:");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);
    }
}


