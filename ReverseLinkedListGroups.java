import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListGroups {
    Node head;
    
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupTail = dummy;

        while (true) {
            int count = 0;
            Node current = prevGroupTail.next;

            // Check if there are at least 'k' nodes left
            while (current != null && count < k) {
                current = current.next;
                count++;
            }

            // If less than 'k' nodes are left, no more reversal is possible
            if (count < k) {
                break;
            }

            Node prev = prevGroupTail;
            Node curr = prev.next;
            Node nextGroupHead = curr;

            // Reverse the current group of nodes
            for (int i = 0; i < k; i++) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect the reversed group with the previous and next groups
            prevGroupTail.next = prev;
            prevGroupTail = nextGroupHead;
            prevGroupTail.next = curr;
        }

        return dummy.next;
    }

    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedListGroups list = new ReverseLinkedListGroups();
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            int num = Integer.parseInt(element);
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            if (list.head == null) {
                list.head = newNode;
            } else {
                Node current = list.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        int k = scanner.nextInt();
        Node reversedHead = list.reverseKGroup(list.head, k);
        list.display(reversedHead);
    }
}
