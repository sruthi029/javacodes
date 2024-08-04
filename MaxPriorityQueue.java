import java.util.*;

class Main {
    private List<Integer> queue;

    public Main() {
        queue = new ArrayList<>();
    }

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(int element) {
        queue.add(element);
        heapifyUp(queue.size() - 1);
    }

    public int getMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE; // Return -Infinity if the queue is empty
        }
        return queue.get(0);
    }

    public int removeMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE; // Return -Infinity if the queue is empty
        }
        int maxElement = queue.get(0);
        int lastIndex = queue.size() - 1;
        queue.set(0, queue.get(lastIndex));
        queue.remove(lastIndex);
        heapifyDown(0);
        return maxElement;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && queue.get(index) > queue.get(parentIndex)) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int size = queue.size();
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largestIndex = index;

        if (leftChildIndex < size && queue.get(leftChildIndex) > queue.get(largestIndex)) {
            largestIndex = leftChildIndex;
        }
        if (rightChildIndex < size && queue.get(rightChildIndex) > queue.get(largestIndex)) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = queue.get(i);
        queue.set(i, queue.get(j));
        queue.set(j, temp);
    }
}

public class MaxPriorityQueue
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main priorityQueue = new Main();

        while (scanner.hasNext()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int element = scanner.nextInt();
                    priorityQueue.insert(element);
                    break;
                case 2:
                    int maxElement = priorityQueue.removeMax();
                    System.out.println(maxElement);
                    break;
                case 3:
                    int currentMax = priorityQueue.getMax();
                    System.out.println(currentMax);
                    break;
                case -1:
                    System.exit(0);
            }
        }

        scanner.close();
    }
}
