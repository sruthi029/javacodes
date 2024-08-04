import java.util.Scanner;

public class StringCharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean hasAlphanumeric = false;
        boolean hasAlphabetical = false;
        boolean hasDigits = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                hasAlphanumeric = true;
                if (Character.isLetter(c)) {
                    hasAlphabetical = true;
                    if (Character.isLowerCase(c)) {
                        hasLowercase = true;
                    } else if (Character.isUpperCase(c)) {
                        hasUppercase = true;
                    }
                } else if (Character.isDigit(c)) {
                    hasDigits = true;
                }
            }
        }

        System.out.println(hasAlphanumeric);
        System.out.println(hasAlphabetical);
        System.out.println(hasDigits);
        System.out.println(hasLowercase);
        System.out.println(hasUppercase);
    }
}
