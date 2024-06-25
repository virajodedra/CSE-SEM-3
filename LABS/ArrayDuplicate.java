import java.util.*;
public class ArrayDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    System.out.println("the duplicates elements of array is :"+arr[i]);
                }
            }
        }

    }
    
}
