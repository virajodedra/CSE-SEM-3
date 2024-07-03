import java.util.*;

 class LL{
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void insertAtFirst(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node  :");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        
    }

    public void insertAtLast(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node  :");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    
    public void display(){
        Node temp = head;
        while(temp.next != null){
             System.out.print(temp.data+" -> ");
             temp=temp.next;
        }
        System.out.println(temp.data+"-> Null");
    }
    
    
}

public class ImplementLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int choice = 0;
        while(choice <=3){
            System.out.println("Enter the 1 to add node at first position");
            System.out.println("Enter the 2 to add node at last position");
            System.out.println("Enter the 3 to display all nodes ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    list.insertAtFirst();
                    break;
                case 2:
                    list.insertAtLast();
                    break;
                case 3:
                    list.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
    
        }
         
    }
    
}
