public class LinkedList {
    private Node head; // Head node 

    // Node class representing an element
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Inserts a new node at the beginning of the linked list */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Insert a new node at the end  */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Delete the node at the beginning.*/
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    /**
     * Displays the elements  */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //  testing implementation
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display(); // Output: 1 -> 2 -> 3 -> null

        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.display(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        list.deleteFromBeginning();
        list.display(); // Output: 2 -> 3 -> 4 -> 5 -> null
    }
}
