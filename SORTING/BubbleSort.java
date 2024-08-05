import java.io.*;
import java.util.*;

class BubbleSort {
    
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1 ; i++) {
            swapped = false;
            for (j = 0; j < n - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    // Here we Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Note :- If no two elements were swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array :");
        int m = sc.nextInt();
        int arr[] = new int[m];

        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}

