import java.util.*;
public class PowerOfNumber{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int a =sc.nextInt();
        System.out.println("Enter the power :");
        int b =sc.nextInt();

        int sum =1;
        
        for(int i=1;i<=b;i++){
            sum = sum*a;
        }
        
        System.out.println("The power of number is :" +sum);

    }
}