import java.util.*;
public class MergeSort {
    public static void main(String[] args) {              // MergeSort 
        Scanner sc = new Scanner(System.in);            
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }    
        System.out.println("Sorted array: ");
        mergeSort(arr, low, high);
        // Finally print our Sorted array !!!
        System.out.println();
        System.out.println("Current array after merging: ");
        for (int m = low; m <= high; m++) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();

    }
    public static void mergeSort(int arr[], int low, int high) {
        int mid;
        if(low < high){
            mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid ,high);
        }
    }
    public static void merge(int arr[], int low, int mid, int high){
        int arr2[] = new int[high - low + 1];
        int h = low, i = 0, j = mid + 1;

        while(h <= mid && j <= high){
            if(arr[h] <= arr[j]){
                arr2[i] = arr[h];
                h = h + 1;
            }
            else{   
                arr2[i] = arr[j];
                j = j + 1;
            }        
            i = i + 1;
        }
        if(h <= mid){
            for (int k = h; k <= mid; k++) {
                arr2[i] = arr[k];
                i = i + 1;

            }
        }
        else if(j <= high){
            for (int k = j; k <= high; k++) {
                arr2[i] = arr[k];
                i = i + 1;  
            }
        }
        //To overwrite the sorted elements on our main array !!
        for(int m = 0; m < arr2.length; m++) {
            arr[low + m] = arr2[m];
        }
    }
    
}
