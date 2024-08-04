import java.util.Stack;
import java.util.*;

public class Balanced_Parenthesis {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression =sc.nextLine();
        boolean balanced = isBalanced(expression);
        System.out.println(balanced);
    }
}
