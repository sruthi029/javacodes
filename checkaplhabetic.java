import java.util.Scanner;

public class checkaplhabetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);

        String result = checkCharacter(character);
        System.out.println(result);
    }

    public static String checkCharacter(char character) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        if (!Character.isAlphabetic(character)) {
            return "Not an alphabet";
        }

        if (contains(vowels, Character.toLowerCase(character))) {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }
    public static boolean contains(char[] array, char target) {
        for (char element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
