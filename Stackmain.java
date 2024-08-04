import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + element);
        } else {
            stackArray[++top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }
}

public class Stackmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Stack stack = new Stack(n);

        for (int i = 0; i < n; i++) {
            String operation = scanner.next();
            if (operation.equals("Push")) {
                int element = scanner.nextInt();
                stack.push(element);
            } else if (operation.equals("Pop")) {
                stack.pop();
            } else if (operation.equals("Print")) {
                stack.printStack();
            }
        }
    }
}
