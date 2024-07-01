import java.util.*;
import javax.sound.sampled.SourceDataLine;

                          // credit goes to VIRAJ ODEDRA.

class operations {
    int maxSize;
    int top = -1;
    int temp;
    int arr[];

    public operations(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        // top = -1;
    }

    public void push() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many elements you want to add under (" + maxSize + ").");
        int choice_2 = sc.nextInt();

        System.out.println("Enter the elements : ");
        for (int i = 0; i < choice_2; i++) {
            if (top >= (maxSize - 1)) {
                System.out.println("Stack Overflow");
                return;
            } else {
                 top++;
                System.out.println("Element at index " + i + " : ");
                arr[top] = sc.nextInt();
                // System.out.println(top);
            }

        }

    }

    public int  pop() {
        // System.out.println(top);
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            // top--;
            // return top + 1;
            int poppedElement = arr[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    
    public void peep(int m) {
            if(top - m + 1 < 0){
                System.out.println("Stack underflow");
            }
            else{
                System.out.println("The " + m + "th element from top is : " + arr[top - m + 1]);
            }
    }
    
    public void change(int n) {
        if(top - n + 1 < 0){
            System.out.println("Stack underflow");
        }
        else{
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the updated value of "+ n +" element :");
            arr[top - n + 1] = sc.nextInt();
            System.out.println("The " + n + "th element has been updated and updated value is " +  arr[top - n + 1] ); 
        }


    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements are : ");
            for(int i = top; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class Stack {
    // Programming of stack using array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MAX stack size : ");
        int maxSize = sc.nextInt();

        int choice = 0;
        operations op = new operations(maxSize);


        while (choice <= 6) {
            System.out.println("Enter 1 for PUSH the element ");
            System.out.println("Enter 2 for POP the element ");
            System.out.println("Enter 3 for PEEP the element ");
            System.out.println("Enter 4 for UPDATE the element ");
            System.out.println("Enter 5 for DISPLAY the stack ");
            System.out.println("Enter 6 for EXIT the code  ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    op.push();
                    // o.pushElement();
                    // o.getvalue();
                    break;
                case 2:
                    int b = op.pop();
                    System.out.println(b);
                    //    op.printPopElement(op.arr , op.top);
                    break;
                case 3:
                    System.out.println("Enter which element you want to select");
                    int m = sc.nextInt();
                    op.peep(m);
                    break;
                case 4:
                    System.out.println("Enter which element you want to update and what value you want to replace");
                    int n = sc.nextInt();
                    op.change(n);
                    break;
                case 5:
                    op.display();
                    break;
                default:
                    System.out.println("EXIT from choice");
                    break;
            }

        }
    }

}
