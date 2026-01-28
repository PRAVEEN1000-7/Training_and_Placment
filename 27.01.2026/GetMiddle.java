import java.util.Scanner;

/* Node class */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/* LinkedList class */
class LinkedList {
    Node head, tail;                                                                                                                                                                                                                                                                                                                                                                     

    // Insert at end
    void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    // Find length of list
    int length() {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    // Get middle element (second middle for even length)
    int getMiddle() {
        if (head == null) return -1;

        Node temp = head;
        int len = length();

        for (int i = 0; i < len / 2; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}

/* Main class */
public class GetMiddle {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            LinkedList list = new LinkedList();

            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Insert element");
                System.out.println("2. Get middle value");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter element: ");
                        int element = sc.nextInt();
                        list.insert(element);
                        System.out.println(element + " inserted successfully.");
                    }

                    case 2 -> {
                        int mid = list.getMiddle();
                        if (mid == -1) {
                            System.out.println("List is empty.");
                        } else {
                            System.out.println("Middle value: " + mid);
                        }
                    }

                    case 3 -> {
                        System.out.println("Exiting program...");
                        return;
                    }

                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
