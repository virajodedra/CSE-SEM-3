import java.util.*;
public class CircularLinkedList{
        int count = 0;
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
        Node last = null;

        public void circularListCount(){
            Node current = first;
            if(first == null){
              System.out.println("The circular list is empty");
              return;
            }
            while(current.next != null){
                current  = current.next;
                count++;
            }
            current.next = first;
            System.out.println("Circular linked list created");
            System.out.println("Total number of nodes: " + count);  
        }
        public void insertAtFirst(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Node :");
            int x = sc.nextInt();

            Node newNode = new Node(x);       
            Node current = first;
            if(first == null){
                first = newNode;
                last = first;
                first.next = first;
                last.next = first;
                return;
            }
            while(current.next != first){
                current  = current.next;
            }
            current.next = newNode;
            newNode.next = first;
            first = newNode;

        }
        public void insertAtLast(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Node :");
            int x = sc.nextInt();

            Node newNode = new Node(x);       
            Node current = first;
            if(first == null){
                first = newNode;
                first.next = first;
                last = first;
                return;
            }
            while(current.next != first){
                current  = current.next;
            }
            current.next = newNode; 
            newNode.next = first;
            last = newNode;

        }
        public void printCircularLinkedList(){
            if(first == null){
                System.out.println("The linked list is empty !!!");
                return;
            }
            Node current = first;
            while(current.next != first){
            System.out.print(current.data + " -> ");
            current = current.next;
            }
            System.out.println(current.data + " -> (back to the first)");
        }                 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        int choice = 0;
        while (choice < 10) {
            System.out.println("Enter the 1 to add node at first position in circular linked list :");
            System.out.println("Enter the 2 to add node at last position in circular linked list :");
            System.out.println("Enter the 3 to print the linked list");
            // System.out.println("Enter the 4 to delete the first node  ");
            // System.out.println("Enter the 5 to delete the last node  ");
            // System.out.println("Enter the 6 to delete the node from ordered linked list. ");
            // System.out.println("Enter the 7 to reverse and print the linked list");
            // System.out.println("Enter the 8 to display all nodes ");
            // System.out.println("Enter the 9 to make circular linked lists ");
            // System.out.println("Enter the 10 to exit the program");


            choice = sc.nextInt();

            switch (choice) {
                case 1:
                   
                    list.insertAtFirst();
                    break;
                case 2:
                    
                    list.insertAtLast();
                    break;
                case 3:
                    list.printCircularLinkedList();
                    break;
                // case 4:
                //     list.deleteAtLast();
                //     break;
                // case 6:
                //     list.delete();
                //     break;
                // case 7:
                //     //  list.printReverse(reverse(first));
                //      LL.Node reversedList = list.reverse();
                //     list.printReverse(reversedList);
                //     break;
                // case 8 :
                //     list.display();
                //     break;
                // case 9:
                //     list.circularList();
                //     break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
