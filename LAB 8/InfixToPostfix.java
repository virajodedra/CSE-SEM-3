//the respected author of all time : @odedra Viraj -->
//this legacy never goes down... 
import java.util.*;
// import java.util.Stack;

public class InfixToPostfix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix Expression :");
        String str = sc.nextLine();
        implement(str); 
        

    }

    static int getPrecidence(char i) {
        if (i == '-' || i == '+') {
            return 1;
        } else if (i == '*' || i == '/') {
            return 2;
        } else if (i == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    static int compareTwoPower(char i) {
        if (i == '^') {
            return 1;
        } else {
            return 0;
        }
    }

    public static void implement(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        // stack.push('(');
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                postfix.append(str.charAt(i));
            } 
            else if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            else if (!stack.isEmpty() && str.charAt(i) == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop());
                 }
                stack.pop();
            } 
            else {
                while(!stack.isEmpty() && (getPrecidence(str.charAt(i)) < getPrecidence(stack.peek()) || getPrecidence(str.charAt(i)) == getPrecidence(stack.peek()) && compareTwoPower(str.charAt(i)) == 0)){
                postfix.append(stack.pop());
                }
                   stack.push(str.charAt(i));
            }        
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        System.out.println(postfix);
    }
}
