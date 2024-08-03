
import java.util.Scanner;

public class Lab_10_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, data, pos; 
        LinkedList list = new LinkedList();
        do {
            System.out.println("Enter 1 to insert a node at the first of the linked list");
            System.out.println("Enter 2 to insert a node at the end of the linked list");
            System.out.println("Enter 3 to insert a node at any position in the linked list");
            System.out.println("Enter 4 to delete a node from first of the linked list");
            System.out.println("Enter 5 to delete a node from the last of the linked list");
            System.out.println("Enter 6 to delete a node from any position of the linked list");
            System.out.println("Enter 7 to display the linked list");
            System.out.println("Enter 8 to count the nodes");
            System.out.println("Enter -1 to exit the menu: \n");
            choice = sc.nextInt();
            switch(choice) {
                case 1: 
                    System.out.println("Enter data to enter: ");
                    data = sc.nextInt();
                    list.insertAtFirst(data);
                    break;
                
                case 2:
                    System.out.println("Enter data to enter: ");
                    data = sc.nextInt();
                    list.insertAtLast(data);
                    break;

                case 3:
                    System.out.println("Enter data to enter: ");
                    data = sc.nextInt();
                    System.out.println("Enter a position at which you want to enter the data: ");
                    pos = sc.nextInt();
                    list.insertAtAnyPosition(data, pos);
                    break;

                case 4:
                    list.deleteFromFirst();
                    break;

                case 5:
                    list.deleteFromLast();
                    break;

                case 6:
                    System.out.println("Enter the position to delete the data: ");
                    pos = sc.nextInt();
                    list.deleteFromAnyPosition(pos);
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    list.count();
                    break;

                default:
                    if(choice != -1) {
                        System.out.println("Invalid input");
                        break;
                    }
            }
            try {
                Thread.sleep(2000);
            } catch(Exception e) {
                e.printStackTrace();
            }
        } while(choice != -1);
        sc.close();
    }
}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node first = null;
    Node last = null;
    
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if(first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
            System.out.println("Element inserted succesfully\n");
            return;
        }
        newNode.next = first;
        last.next = newNode;
        first = newNode;
        System.out.println("Element inserted succesfully\n");
    }
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if(first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
            System.out.println("Element inserted succesfully\n");
            return;
        }
        last.next = newNode;
        newNode.next = first;
        last = newNode;
        System.out.println("Element inserted succesfully\n");
    }

    public void insertAtAnyPosition(int data, int pos) {
        Node newNode = new Node(data);
        if(first == null) {
            if(pos == 1) {
                insertAtFirst(data);
                return;
            }
            else {
                System.out.println("Position not Found\n");
                return;
            }
        }
        else if(pos == 1) {
            insertAtFirst(data);
            return;
        }
        Node current = first;
        Node previous = null;
        for(int i=1; i<pos ;i++) {
            if(current != last) {
                previous = current;
                current = current.next;
            }
            else {
                if(i == pos-1) {
                    insertAtLast(data);
                    return;
                }
                else {
                    System.out.println("Position not found\n");
                    return;
                }
            }
        }
        newNode.next = previous.next;
        previous.next = newNode;
        System.out.println("Element inserted succesfully\n");
    }

    public void deleteFromFirst() {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        if(first == last) {
            first = null;
            last = null;
            System.out.println("Element deleted succesfully\n");
            return;
        }
        Node temp = first;
        first = first.next;
        last.next = first;
        temp = null;
        System.out.println("Element deleted succesfully\n");
    }

    public void deleteFromLast() {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        if(first == last) {
            first = null;
            last = null;
            System.out.println("Element deleted succesfully\n");
            return;
        }
        Node current = first;
        while(current.next != last) {
            current = current.next;
        }
        current.next = first;
        last = null;
        last = current;
        System.out.println("Element deleted succesfully\n");
    }

    public void deleteFromAnyPosition(int pos) {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        if(pos == 1) {
            deleteFromFirst();
            return;
        }
        Node current = first;
        Node previous = null;
        for(int i=1; i<pos; i++) {
            if(current != last) {
                previous = current;
                current = current.next;
            }
            else if(i == pos-1) {
                previous.next = current.next;
                current = null;
                last = previous;
                System.out.println("Element deleted succesfully\n");
                return;
            }
            else {
                System.out.println("Position not found");
                return;
            }
        }
        previous.next = current.next;
        current = null;
        System.out.println("Element deleted succesfully\n");
    }

    public void display() {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = first;
        while(temp != last) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void count() {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = first;
        int count = 0;
        while(current != last) {
            current = current.next;
            count++;
        }
        System.out.println("Number of nodes = "+(++count));
    }
}
