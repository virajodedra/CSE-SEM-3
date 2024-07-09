import java.util.*;
public class LAB_4_23 {
    //Write a program to insert a number in an array that is already sorted in an
        //ascending order.
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n;i++){
            System.out.println("Enter the ("+i+") element  :");
            arr[i] = sc.nextInt();
            
        }
        System.out.println("Enter the location of the element that you want to insert :");
        int m = sc.nextInt();

        int array[] = new int[n+1];
        for (int i = 0; i < array.length; i++){
            if(arr[i] < m){
                array[i] = arr[i];
            }
            else if(arr[i] < m &&  m < arr[i+1]){
                
                array[i] = m;
            }
            else{
                
                array[i] = arr[i-1];
            }

        }
        for(int i=0; i<arr.length; i++){
            System.out.println("" + array[i]);

        }


        
        
    }
    
}
