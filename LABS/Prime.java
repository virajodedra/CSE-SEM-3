import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n  = sc.nextInt();

        int c =0;
            for(int i = 2; i < n/2 ; i++){
                
                if(n%i==0){
                    c =1;
                    break;
                }
                else{

                }


            }
            if(c==1){
                System.out.println("The number is NOT prime");
            }else{
                System.out.println("The number is  prime");
            }



    }
}