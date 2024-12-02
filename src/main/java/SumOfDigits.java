public class SumOfDigits {
    public static void main(String[] args) {
        String number = "12345"; // Input as a string
        int sum = 0;

        // Iterate over each character in the string
        for (char ch : number.toCharArray()) {
            // Convert the character to an integer and add to sum
            sum += Character.getNumericValue(ch);
        }

        System.out.println("Output: " + sum); // Output the result
    }
}
