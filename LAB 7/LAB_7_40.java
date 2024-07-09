import java.util.*;

class Stack {
    int top = -1;
    char[] S = new char[101];

    public void push(char x) {
        if (top >= 100) {
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
    
    public int size() {
        return top + 1; //here we add top + 1 bcoz it stars with -1 ...
    }
}

public class LAB_7_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine().toLowerCase();
        
        Stack s = new Stack();
        Stack s2 = new Stack();
        
        int i = 0;
        while (i < str.length() && str.charAt(i) == 'a') {
            s.push(str.charAt(i));
            i++;
        }
        
        while (i < str.length() && str.charAt(i) == 'b') {
            s2.push(str.charAt(i));
            i++;
        }


        if (s.size() == s2.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
