import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        int result = linearSearch(arr,n);
        if (result == -1) System.out.println("Can't find element");
        else System.out.println("Element found at index: " + result);

    }

    public static  int linearSearch(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
