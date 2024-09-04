import java.util.*;
public class CountingSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element : ("+i+")");
            arr[i] = sc.nextInt();
        }
        countingSearch(arr, n);
    }

    public static void countingSearch(int[] arr, int n){
        int max = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] demo = new int[max + 1];

        for(int  i = 0 ; i < n ; i++){
            demo[arr[i]]++;
        }

        for (int i = 1; i < demo.length; i++) {
            demo[i] += demo[i - 1];
        }

        int[] array = new int[n];
        for(int i = n - 1; i >= 0; i--){
            array[demo[arr[i]]-1] = arr[i];
        }

        System.out.println("The sorted array by counting sort is :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
