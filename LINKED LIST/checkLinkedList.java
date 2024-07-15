// import java.util.*;
// class List {

//     class Node {

//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node first = null;
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

//     public boolean compare(){
//         Node pred = first;
//         Node curr = first;
//         Node check = null;
//         while(curr!=null){
//             if(curr.data!=pred.data){
//                 return false;
//             }
//             check = curr;
//             pred = curr;
//             curr = curr.next;
//         }
//         return true;

//     }
// }
// public class checkLinkedList {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         List list = new List();
//         List list2 = new List();
//         int choice = 0;
//         while (choice < 10) {
//             System.out.println("Enter the 1 to add node at last position in 1st linked list");
//             System.out.println("Enter the 2 to add node at last position 2nd linked list");
//             System.out.println("Enter the 3 to comapre both lists");
//             choice = sc.nextInt();
//             boolean flag = false;

//             switch (choice) {
//                 case 1:
//                     list.insertAtLast();
//                     break;
//                 case 2:
//                     list2.insertAtLast();
//                     break;
//                 case 3:
//                     flag = list.compare();
//                     if(flag){
//                         System.out.println("Both lists are same");
//                     }else{
//                         System.out.println("Both lists are not same");
//                     }
//                     break;
//                 default:
//                     System.out.println("Invalid choice");
//                     break;
//             }

//         }

//     }

// }

import java.util.Scanner;

class List {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node first = null;

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

    public boolean compare(List otherList) {
        Node current1 = this.first;
        Node current2 = otherList.first;
        
        if (current1 == null && current2 == null) {
            return true;
        }

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return true;
    }
}

public class checkLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list1 = new List();
        List list2 = new List();
        int choice;

        while (true) {
            System.out.println("Enter the 1 to add node at last position in 1st linked list");
            System.out.println("Enter the 2 to add node at last position in 2nd linked list");
            System.out.println("Enter the 3 to compare both lists");
            System.out.println("Enter any other number to exit");
            choice = sc.nextInt();
            boolean flag;

            switch (choice) {
                case 1:
                    list1.insertAtLast();
                    break;
                case 2:
                    list2.insertAtLast();
                    break;
                case 3:
                    flag = list1.compare(list2);
                    if (flag) {
                        System.out.println("Both lists are the same");
                    } else {
                        System.out.println("Both lists are not the same");
                    }
                    break;
                default:
                    System.out.println("Exiting program.");
                    return;
            }
        }
    }
}
