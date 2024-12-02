public class ReverseString {
    public static void main(String[] args) {
        String input = "hello"; // Given input
        char[] charArray = input.toCharArray(); // Convert string to character array
        int left = 0; // Starting index of the character array
        int right = charArray.length - 1; // Ending index of the character array

        // Reverse the array in place
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        // Convert reversed character array back to a string
        String output = new String(charArray);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output); // Print the reversed string
    }
}