import java.util.*;
import java.util.HashSet;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Append_Without_Duplicates {
     Node head;
    public  void append()
    {
       
       if (head == null) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    Append_Without_Duplicates list = new Append_Without_Duplicates();
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
       list.append();
        list.display();
    }
}
