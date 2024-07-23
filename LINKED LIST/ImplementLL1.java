
// import java.util.*;

// class LL {

//     class Node {

//         // pass the int data and Node next
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node first = null;

//     public void insertAtFirst() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter node  :");
//         int x = sc.nextInt();

//         Node newNode = new Node(x);

//         if (first == null) {
//             first = newNode;
//         } else {
//             newNode.next = first;
//             first = newNode;
//         }

//     }

//     public void insertAtLast() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter node  :");
//         int x = sc.nextInt();

//         Node newNode = new Node(x);
//         if (first == null) {
//             first = newNode;
//         } else {
//             Node temp = first;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }

//     public void insord() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter node  :");
//         int x = sc.nextInt();
//         Node newNode = new Node(x);

//         if (first == null || x <= first.data) {
//             newNode.next = first;
//             first = newNode;
//             return;

//         }
//         Node current = first;

//         while (current.next != null && x >= current.next.data) {
//             current = current.next;
//         }
//         newNode.next = current.next;
//         current.next = newNode;
//     }

//     public void deleteAtFirst() {
//         if (first == null) {
//             System.out.println("Can't delete first");
//             return;
//         }
//         Node current = first;
//         first = current.next;
//         System.out.println("First node deleted");
//     }

//     public void deleteAtLast() {
//         if (first == null) {
//             System.out.println("Can't delete last");
//             return;
//         }

//         Node current = first;
//         while (current.next.next != null) {
//             current = current.next;

//         }
//     }

//     public void delete() {
//         Scanner sc = new Scanner(System.in);
//         if (first == null) {
//             System.out.println("Can't delete");
//             return;
//         }
//         System.out.println("Enter the the info part of the node");
//         int x = sc.nextInt();

//         Node current = first;
//         Node pred = current;
//         while (current != null && current.data  != x) {
//             pred = current;
//             current = current.next;
//         }
//         pred.next = current.next;


//     }
//     public Node reverse(){
//         Node pred = null;
//         Node next = null;
//         Node current = first;

//         while(current != null){
//              next = current.next;
//             current.next = pred;

//             pred  = current;    
//             current = next;
//         }
//         first = pred;   
//         return first;
//     }
//     public void printReverse(Node first) {
//         Node current = first;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println( " Null ");
        
//     }

//     public void display() {
//         Node temp = first;
//         while (temp.next != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println(temp.data + "-> Null");

//     }
    
// }

// public class ImplementLL1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LL list = new LL();
//         int choice = 0;
//         while (choice < 9) {
//             System.out.println("Enter the 1 to add node at first position");
//             System.out.println("Enter the 2 to add node at last position");
//             System.out.println("Enter the 3 to add node at specific position");
//             System.out.println("Enter the 4 to delete the first node  ");
//             System.out.println("Enter the 5 to delete the last node  ");
//             System.out.println("Enter the 6 to delete the node from ordered linked list. ");
//             System.out.println("Enter the 7 to reverse and print the linked list");
//             System.out.println("Enter the 8 to display all nodes ");
//             System.out.println("Enter the 9 to exit the program");


//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     list.insertAtFirst();
//                     break;
//                 case 2:
//                     list.insertAtLast();
//                     break;
//                 case 3:
//                     list.insord();
//                     break;
//                 case 4:
//                     list.deleteAtFirst();
//                     break;
//                 case 5:
//                     list.deleteAtLast();
//                     break;
//                 case 6:
//                     list.delete();
//                     break;
//                 case 7:
//                     //  list.printReverse(reverse(first));
//                      LL.Node reversedList = list.reverse();
//                     list.printReverse(reversedList);
//                     break;
//                 case 8 :
//                     list.display();
//                     break;
//                 default:
//                     System.out.println("Invalid choice");
//                     break;
//             }

//         }

//     }
// }


import java.util.*;

class LL {
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
        if (first == null) {
            System.out.println("Can't delete first");
            return;
        }
        Node current = first;
        first = current.next;
        System.out.println("First node deleted");
    }

    public void deleteAtLast() {
        if (first == null) {
            System.out.println("Can't delete last");
            return;
        }

        Node current = first;
        while (current.next.next != null) {
            current = current.next;

        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        if (first == null) {
            System.out.println("Can't delete");
            return;
        }
        System.out.println("Enter the the info part of the node");
        int x = sc.nextInt();

        Node current = first;
        Node pred = current;
        while (current != null && current.data  != x) {
            pred = current;
            current = current.next;
        }
        pred.next = current.next;


    }
    public Node reverse(){
        Node pred = null;
        Node next = null;
        Node current = first;

        while(current != null){
             next = current.next;
            current.next = pred;

            pred  = current;    
            current = next;
        }
        first = pred;   
        return first;
    }
    public void printReverse(Node first) {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println( " Null ");
        
    }

    public void display() {
        Node temp = first;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + "-> Null");

    }
    public void circularList(){
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
    
}

public class ImplementLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int choice = 0;
        while (choice < 10) {
            System.out.println("Enter the 1 to add node at first position");
            System.out.println("Enter the 2 to add node at last position");
            System.out.println("Enter the 3 to add node at specific position");
            System.out.println("Enter the 4 to delete the first node  ");
            System.out.println("Enter the 5 to delete the last node  ");
            System.out.println("Enter the 6 to delete the node from ordered linked list. ");
            System.out.println("Enter the 7 to reverse and print the linked list");
            System.out.println("Enter the 8 to display all nodes ");
            System.out.println("Enter the 9 to make circular linked lists ");
            System.out.println("Enter the 10 to exit the program");


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
                    list.deleteAtFirst();
                    break;
                case 5:
                    list.deleteAtLast();
                    break;
                case 6:
                    list.delete();
                    break;
                case 7:
                    //  list.printReverse(reverse(first));
                     LL.Node reversedList = list.reverse();
                    list.printReverse(reversedList);
                    break;
                case 8 :
                    list.display();
                    break;
                case 9:
                    list.circularList();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

    }
}

