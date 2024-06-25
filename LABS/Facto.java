import java.util.*;

 public class Facto{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int r  = sc.nextInt();

        int sum =1;

         for(int i=1; i<=r;i++){
            sum = i*r;
         }
        
                System.out.println("The factorial is :"  +sum);

    }
 }