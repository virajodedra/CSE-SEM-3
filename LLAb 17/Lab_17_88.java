// In an array of 20 elements, arrange 15 different values, which are generated
// randomly between 1,00,000 to 9,99,999. Use hash function to generate key and
// linear probing to avoid collision. H(x) = (x mod 18) + 2. Write a program to input
// and display the final values of array.
import java.util.*;

 public class Lab_17_88{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 15 Elements of the array :");
        int[] arr = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Enter the ("+i+")");
            arr[i] = sc.nextInt();
        }

        int[] array = new int[20];

        store(arr, array);
        
    }

    public static void store(int[] arr, int[] array){
        int n = arr.length;
        for(int i = 0; i < n; i++){

            int index = hashing(arr[i], array);

            array[index] = arr[i];
        }

    }

    public static  int hashing(int n, int[] array){

        int idx = (n % 18) + 2;

        if(array[idx] != 0){
            while (array[idx] != 0) { 
                idx = (++idx) % 20;
            }
        }
        return idx;
       //virajodedra
    }
 }
