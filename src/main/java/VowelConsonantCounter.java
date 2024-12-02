public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World"; // Input string
        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "aeiou";  // String of all vowels

        // Convert the input to lowercase to simplify comparison
        input = input.toLowerCase();

        // Traverse each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel using contains
            if (vowels.contains(Character.toString(ch))) {
                vowelCount++;
            } else {
                consonantCount++; // All non-vowels are treated as consonants
            }
        }

        // Print the results
        System.out.println("Input: " + input);
        System.out.println("Output: Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}