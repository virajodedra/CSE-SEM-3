import java.util.Stack;
import java.util.*;

//the respected author of all time : @odedra Viraj -->
//this legacy never goes down... 
import java.util.*;
import java.util.Stack;

public class InfixTOPostFix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix Expression :");
        String str = sc.nextLine();
        implement(str);

    }
    public int getPrecidence(){
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            return 1;
        } 
        else if(str.charAt(i) == '*' || str.charAt(i) == '/'){
            return 2;
        }
        else if(str.charAt(i) == '^'){
            return 3;
        }
        else{
            return -1;
        }
    }

    public int compareTwoPower(){
        if(str.charAt(i) == '^'){
            return 1;
        }
        else{
            return 0;
        }
    }


    public static String implement(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        stack.push('(');
        for (int i = 0; i < str.length(); i++) {
            int n = getPrecidence(i);
            
            if(n < 0){
                postfix.append(str.charAt(i));
            }
            else if( str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                while(stack.peek()!= '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
            else{
                
            }

            if(str.charAt(i) == '^' && str.charAt(i+1) == '^'){

            }

        }
        return str;
    }
}
