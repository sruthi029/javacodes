import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BSTRange {
    static void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data > k1) {
            printRange(root.left, k1, k2);
        }

        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        if (root.data < k2) {
            printRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, arr[i]);
        }
        printRange(root, k1, k2);
    }
    static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
}
