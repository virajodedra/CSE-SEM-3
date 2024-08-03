import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node first = null;
    
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        System.out.println("Element inserted ");
    }
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if(first == null) {
            first = newNode;
            System.out.println("Element inserted ");
            return;
        }
        Node last = first;
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
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
            if(current.next != null) {
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
        Node temp = first;
        first = first.next;
        temp = null;
        System.out.println("Element deleted ");
    }

    public void deleteFromLast() {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        if(first.next == null) {
            first = null;
            System.out.println("Element deleted ");
            return;
        }
        Node current = first;
        Node previous = null;
        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        current = null;
        previous.next = null;
        System.out.println("Element deleted succesfully\n");
    }

    public void deleteFromAnyPosition(int pos) {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        if(position == 1) {
            deleteFromFirst();
            return;
        }
        Node current = first;
        Node previous = null;
        for(int i = 1; i < position; i++) {
            if(current.next != null) {
                previous = current;
                current = current.next;
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
        while(temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }

    public void count() {
        if(first == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = first;
        int count = 0;
        while(current != null) {
            current = current.next;
            count++;
        }
        System.out.println("Number of nodes = "+count);
    }
}


public class Lab_12_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice
        int data;
        int position; 
        Stack stack = new Stack();
        do {
            System.out.println("Enter 1 to insert a node at the first of the linked list !");
            System.out.println("Enter 2 to insert a node at the end of the linked list !!");
            System.out.println("Enter 3 to insert a node at any position in the linked list !!!");
            System.out.println("Enter 4 to delete a node from first of the linked list !");
            System.out.println("Enter 5 to delete a node from the last of the linked list !!");
            System.out.println("Enter 6 to delete a node from any position of the linked list !!!");
            System.out.println("Enter 7 to display the linked list !");
            System.out.println("Enter 8 to count the nodes !!");
            System.out.println("Enter -1 to exit the menu: \n !!!");
            choice = sc.nextInt();
            switch(choice) {
                case 1: 
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    Stack.insertAtFirst(data);
                    break;
                
                case 2:
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    Stack.insertAtLast(data);
                    break;

                case 3:
                    System.out.println("Enter The data : ");
                    data = sc.nextInt();
                    System.out.println("Enter a position at which you want to enter the data: ");
                    position = sc.nextInt();
                    Stack.insertAtAnyPosition(data, position);
                    break;

                case 4:
                    Stack.deleteFromFirst();
                    break;

                case 5:
                    Stack.deleteFromLast();
                    break;

                case 6:
                    System.out.println("Enter the position to delete the data: ");
                    position = sc.nextInt();
                    Stack.deleteFromAnyPosition(pos);
                    break;

                case 7:
                    Stack.display();
                    break;

                case 8:
                    Stack.count();
                    break;

                default:
                    if(choice != -1) {
                        System.out.println("Invalid input");
                        break;
                    }
            }
        } while(choice != -1);
        
        if(list.first == null) {
            System.out.println("List is empty");
            return;
        }

        LinkedList list2 = new LinkedList();
        list2.first = new Node(list.first.data);
        Node pred = list2.first;
        Node current = list.first.next;
        while(current!=null) {
            Node newNode = new Node(current.data);
            pred.next = newNode;
            pred = newNode;
            current = current.next;
        }
        list2.display();

        sc.close();
    }
}
