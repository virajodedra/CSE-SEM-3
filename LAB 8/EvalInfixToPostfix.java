import java.util.*;
import java.util.Stack;                    //author : Odedra Viraj A.
                                           // THIS LEGACY NEVER GOES DOWN !!!!!!
public class EvaluatePostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression to Evaluate : ");
        String str  = sc.nextLine();
        int result = Operations(str);
        System.out.println("Result : " + result);
        
    }
  
    public static int Operations(String str){
        Stack<Integer> stack = new Stack<>();
        int operator1 = 0, operator2 = 0;

        for (int i = 0; i < str.length(); i++) {
            int v = str.charAt(i);
            if (Character.isLetterOrDigit(v)) {
                stack.push(v - '0');
            }
            
            else if( v == '+' || v == '-' || v == '/' || v == '*' || v == '^') {
                operator1 = stack.pop();
                operator2 = stack.pop();
                switch(v){
                    case '+':
                        stack.push(operator2 + operator1);
                        break;
                    case '-':
                        stack.push(operator2 - operator1);
                        break;
                    case '*':
                        stack.push(operator2 * operator1);
                        break;
                    case '/':
                        stack.push(operator2 / operator1);
                        break;
                    case '^':
                        stack.push( (int)Math.pow(operator2, operator1));
                        break;
                    default:
                        System.out.println("Invalid operator");
                        break;
         
                }
            }
            else{
                // here we catch all the commas use in the  input String ...
            }
        }
        int ans = stack.pop();
        return ans;
    }
}
