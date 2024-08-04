import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Delete_Node_from_Linkedlist{
    Node head;
    public void delete(int pos) {
        Node current = head;
         if (head == null)
            return;
        if (pos == 0) {
            head = current.next;
            return;
        }
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        Node nextNode = current.next.next;
        current.next = nextNode;
    }
    public void display()
    {
        Node node = head;
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Delete_Node_from_Linkedlist list=new Delete_Node_from_Linkedlist();
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
        int index = scanner.nextInt();
        list.delete(index);
        list.display();
    }
}


