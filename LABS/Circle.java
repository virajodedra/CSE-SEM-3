import java.util.*;

 public class Circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int r  = sc.nextInt();


        double area = Math.PI*r*r;
        System.out.println("The are is :" +area);
        
    }
 }