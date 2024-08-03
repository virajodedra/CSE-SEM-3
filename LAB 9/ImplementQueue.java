
// import java.util.*;
// class Queue{
//     int size;
//     int front = -1;
//     int rear = -1;
//     int[] queue;
//     int val = 0;
//     public Queue(int size){
//         this.size = size;
//         this.queue = new int[size];
//     }


//     public void enqueue(int data){
//         if(rear >= size){
//             System.out.println("Queue Overflow!");
//             return;
//         }
//         rear = (rear + 1)%size;
//         queue[rear] = data;
//         return;
//     }

//     public int dequeue(){
//         if(front == -1){
//             System.out.println("Queue Empty!");
//             return 0;
//         }
//         val = queue[front];
//         front = (front + 1)%size;
//         return val;
//     }

//     public void display(){
//         for (int i = front; i <= rear; i++) {
//             System.out.print(queue[(i + 1) % size]); 
//         }
//         System.out.println();
//     }
// }
// public class ImplementQueue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Entre the size of the Queue !!");
//         int size  = sc.nextInt();

//         Queue queue = new Queue(size);
//         int choice = 0;

//         while(true){
//             switch(choice){
//                 System.out.println("Enter your choice : ");
//                 choice = sc.nextInt();
//                 case 1 :
    
//             }
//         }

//     }
    
// }
import java.util.Scanner;

class Queue {
    int size;
    int front = -1;
    int rear = -1;
    int[] queue;

    public Queue(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) {
            front = 0; 
        }
        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty!");
            return -1; 
        }
        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return data;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        } while (i != (rear + 1) % size);
        System.out.println();
    }
}

public class ImplementQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Queue:");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        int choice = 0;
        while (choice != 4){
            System.out.println("Choose an option:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue:");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    int Value = queue.dequeue();
                    if (Value != -1) {
                        System.out.println("Dequeued value: " + Value);
                    }
                    break;
                case 3:
                    System.out.println("Queue contents:");
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting... Bye Bye !!!!!!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                    break;
            }
        }

        sc.close();
    }       
}
