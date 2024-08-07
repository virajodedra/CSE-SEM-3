import java.util.*;
public class BinerySearchByRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        
        int result = binarySearchByRecursion(arr, 0, n - 1, key);
        
        if(result == -1){
            System.out.println("Element not found");
            return;
        }
        else{
            System.out.println("Element found at index: " + result);
            return;
        }
    }
    public static int binarySearchByRecursion(int arr[], int left, int right, int key) {
        while(left <= right){
            
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == key){
                return mid;
            }   
            if(arr[mid] < key){
                return binarySearchByRecursion(arr,left,mid - 1,key);
            } 
            else {
                return binarySearchByRecursion(arr,mid + 1,right,key);
            }
        }
        return -1;
    }   
}
