import java.util.*;

public class EvaluatePostfixExpression {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> operandStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                operandStack.push(ch - '0');  // Convert character digit to integer and push onto the stack
            } else if (ch == ' ') {
                continue;
            } else {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();

                int result;
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }

                operandStack.push(result);
            }
        }

        return operandStack.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String postfixExpression =sc.nextLine();
        int result = evaluatePostfix(postfixExpression);
        System.out.println(result);
    }
}
