public class StringManipulation {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        // Remove spaces, commas, and colons using regular expression
        String result = input.replaceAll("[ ,:]", "").toLowerCase();

        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }
}