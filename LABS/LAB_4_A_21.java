import java.util.*;
public class LAB_4_A_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n =sc.nextInt();
        

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index you wan a add the number  :");
        int m =sc.nextInt();

        int[] ar = new int[n+1];

        for(int i = 0; i < n; i++){
            if(i<m){
                ar[i] = arr[i];
            }
            else if(i==m){
                System.out.println("Enter  the number at index "+m+" :");
                ar[i] = sc.nextInt();
            }
            else{
                ar[i] = arr[i-1];
            }
        }
        
        for(int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }


    }
    
}
