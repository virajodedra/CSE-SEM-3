
import java.util.*;

class Stack {
    int top = -1;
    char[] S = new char[50];

    public void push(char x) {
        if (top >= 51) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        S[top] = x;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return S[top--];            
        }
    }

    public char peep(int x) {
        if (top - x + 1 < 0) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return S[top - x + 1];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StringRecognise {
  /*How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
program to solve the above problem.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        s = s.trim();
        int count = 0;

        Stack S1 = new Stack();
        boolean isValid = true;
        int loop = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'b') {
                S1.push(s.charAt(i));
            }

            else if (s.charAt(i) == 'c') {
                loop = i + 1;
                count++;
                // System.out.println("The count of loop is " +loop +" ");
                break;

            }

            else {
                isValid = false;
                break;
            }
        }

        for (int i = loop; i < s.length(); i++) {
            if (s.charAt(i) != S1.pop()) {
                isValid = false;
                break;
            }
        }

        if (isValid && S1.isEmpty()) {
            if (count == 0) {
                System.out.println("No character 'c' found in the string");
                return;
            }
            System.out.println("String is recognized");
        }

        else {
            System.out.println("String is not recognized");
        }

        sc.close();
    }
}
