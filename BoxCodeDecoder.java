import java.util.Scanner;

public class BoxCodeDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int box1 = scanner.nextInt();
        int box2 = scanner.nextInt();
        int box3 = scanner.nextInt();
        int[] numbers = {box1, box2, box3};
        int secondLargest = findSecondLargest(numbers);
        int largestDivisor = findLargestDivisor(numbers);
        System.out.println("The treasure is in the box which has the number " + secondLargest);
        System.out.println("The code to open the box is " + largestDivisor);
    }
    private static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }

    private static int findLargestDivisor(int[] numbers) {
        int smallestNumber = findSmallestNumber(numbers);
        int largestDivisor = 1;

        for (int i = 1; i <= smallestNumber; i++) {
            boolean isDivisor = true;
            for (int number : numbers) {
                if (number % i != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                largestDivisor = i;
            }
        }

        return largestDivisor;
    }

    private static int findSmallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}
