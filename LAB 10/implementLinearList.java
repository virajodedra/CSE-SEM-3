import java.util.*;

class LL {
    class Node {
        // pass the int data and Node next
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node first = null;

    public void insertAtFirst() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node  :");
        int x = sc.nextInt();

        Node newNode = new Node(x);

        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }

    }

    public void insertAtLast() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node  :");
        int x = sc.nextInt();

        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node  :");
        int x = sc.nextInt();
        Node newNode = new Node(x);

        if (first == null || x <= first.data) {
            newNode.next = first;
            first = newNode;
            return;

        }
        Node current = first;

        while (current.next != null && x >= current.next.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    
    public void deleteAtFirst() {
        if(first == null){
            System.out.println("Can't delete first");
            return;
        }
        Node current = first;
        first = current.next;
        System.out.println("First node deleted");
    }
    
    public void deleteAtLast() {
        if(first == null){
            System.out.println("Can't delete last");
            return;
        }

        Node current = first;
        while(current.next.next != null){
            current = current.next;

        }
    }
    public void delete(){
        if(first == null){
            System.out.println("Can't delete");
            return;
        }

        Node current = first;
        while(current != null && current.next.next != null){
    }

    public void display() {
        Node temp = first;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + "-> Null");
    }

}

public class ImplementLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int choice = 0;
        while (choice <= 5) {
            System.out.println("Enter the 1 to add node at first position");
            System.out.println("Enter the 2 to add node at last position");
            System.out.println("Enter the 3 to add node at specific position");
            System.out.println("Enter the 4 to display all nodes ");
            System.out.println("Enter the 5 to delete the first node  ");
            System.out.println("Enter the 5 to delete the last node  ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.insertAtFirst();
                    break;
                case 2:
                    list.insertAtLast();
                    break;
                case 3:
                    list.insord();
                     break;
                case 4:
                    list.display();
                    break;
                case 5:
                    list.deleteAtFirst();
                    break;
                case 6:
                    list.deleteAtLast();
                    break;
                case 7:
                    list.delete();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

    }

}
