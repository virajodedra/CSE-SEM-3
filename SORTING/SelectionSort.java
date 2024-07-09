import java.util.*;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the ("+i+") element of the array :");
            arr[i] = sc.nextInt();

        }
        SelectionSort os = new SelectionSort();
        os.Sort( arr , n);
    }

    public void Sort(int arr[], int n){

        for(int i=0; i<arr.length-1; i++){

            int minIndex = i;

            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[minIndex]){
                    minIndex = j;

                    int temp = arr[minIndex];
                    arr[minIndex]= arr[i];
                    arr[i] = temp;
                }

            }

        }

        System.out.println("The sorted Array is :");
        for (int i=0; i<n;i++){
             
            System.out.print(arr[i]+" ");

        }
            
    }   
    
}
