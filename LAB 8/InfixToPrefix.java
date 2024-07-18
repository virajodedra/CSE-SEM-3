// import java.util.*;
import java.util.Stack;

// public class InfixToPrefix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the infix Expression:");
//         String str = sc.nextLine();
        
//         String prefix = implementInfix(str);
//         System.out.println("Prefix Expression: " + prefix);
//     }

//     static int getPrecidence(char i) {
//         if (i == '-' || i == '+') {
//             return 1;
//         } else if (i == '*' || i == '/') {
//             return 2;
//         } else if (i == '^') {
//             return 3;
//         } else {
//             return -1;
//         }
//     }
//     static String implementInfix(String str) {
//         Stack<Character> stack = new Stack<>();
//         StringBuilder prefix = new StringBuilder();

//         // Here we Reverse the infix expression and then swap '(' with ')'
//         StringBuilder infix = new StringBuilder(str).reverse();
//         for (int i = 0; i < infix.length(); i++) {
//             if (infix.charAt(i) == '(') {
//                 infix.setCharAt(i, ')');
//             } else if (infix.charAt(i) == ')') {
//                 infix.setCharAt(i, '(');
//             }
//         }

//         for (int i = 0; i < infix.length(); i++) {
//             char temp = infix.charAt(i);

//             if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
//                 prefix.append(str.charAt(i));
//             } 
//             else if(temp == '(') {
//                 stack.push(temp);
//             } 
//             else if(temp == ')') {
//                 while (!stack.isEmpty() && (getPrecidence(str.charAt(i)) < getPrecidence(stack.peek()) || getPrecidence(str.charAt(i)) == getPrecidence(stack.peek()))){ 
//                     stack.push(str.charAt(i));
//                 }
//                 stack.pop();
//             } 
//             else{
//                 while(!stack.isEmpty() && (getPrecidence(str.charAt(i)) <= getPrecidence(stack.peek()))){
//                     prefix.append(stack.pop());
//                 }
//                    stack.push(str.charAt(i));
//             }     
//         }

//         while (!stack.isEmpty()) {
//             prefix.append(stack.pop());
//         }
//         return prefix.reverse().toString();
//     }
// }


import java.util.*;
public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix Expression:");
        String str = sc.nextLine();
        
        String prefix = infixToPrefix(str);
        System.out.println("Prefix Expression: " + prefix);
    }

    static int getPrecedence(char temp) {
        if (temp == '-' || temp == '+') {
            return 1;
        } else if (temp == '*' || temp == '/') {
            return 2;
        } else if (temp == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    static String infixToPrefix(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();

        // Reverse the infix expression and then swap '(' with ')'
        StringBuilder infix = new StringBuilder(str).reverse();
        for (int i = 0; i < infix.length(); i++) {
            if (infix.charAt(i) == '(') {
                infix.setCharAt(i, ')');
            } else if (infix.charAt(i) == ')') {
                infix.setCharAt(i, '(');
            }
        }

        for (int i = 0; i < infix.length(); i++) {
            char temp = infix.charAt(i);

            if (Character.isLetterOrDigit(temp)) {
                prefix.append(temp);
            } else if (temp == '(') {
                stack.push(temp);
            } else if (temp == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    prefix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPrecedence(temp) < getPrecedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                stack.push(temp);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }
}
