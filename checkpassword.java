import java.util.Scanner;
public class checkpassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int result = checkPassword(password);
        System.out.println(result);
    }
    public static int checkPassword(String str) {
        // Condition 1: Check minimum length
        if (str.length() < 4) {
            return 0;
        }
        // Condition 2: Check for at least 1 digit
        boolean containsDigit = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }
        if (!containsDigit) {
            return 0;
        }
        boolean containsCapitalLetter = false;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsCapitalLetter = true;
                break;
            }
        }
        if (!containsCapitalLetter) {
            return 0;
        }

        // Condition 4: Check for spaces and slashes
        if (str.contains(" ") || str.contains("/")) {
            return 0;
        }

        // Condition 5: Check first character is not a digit
        char firstChar = str.charAt(0);
        if (Character.isDigit(firstChar)) {
            return 0;
        }

        // If all conditions are satisfied, return 1
        return 1;
    }
}
