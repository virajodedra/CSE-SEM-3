import java.util.*;
public class LAB_4_A_22 {
    //c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the ("+i+") element  :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the location of the element that you want to delete :");
        int m = sc.nextInt();

        int ar[] = new int[n-1];
        for(int i=0; i<ar.length; i++){
            if(n!=m){
                ar[i] = arr[i];
            }

            else {
                ar[i] = arr[i+1];
            }
        }

        for(int i=0; i<m; i++){
            System.out.println("" + ar[i]);
           
        }
        
    }
    
}
