// Java program for implementation of Insertion Sort 
import java.util.*;
class InsertionSort { 
	public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array.");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Sorted array: ");
		// InsertionSort1 ob = new InsertionSort1(); 
		// ob.sort(arr); 
		sort(arr);
		printArray(arr); 

        sc.close();
	} 
  
	public static void sort(int arr[]) { 
  
  // int i = 1;
  //       while(i < n){
  //           int key = arr[i];
  //           int j = i - 1;

  //               while(j >= 0 && arr[j] > key){
  //                   arr[j + 1] = arr[j];
  //                   j--;
  //               }
  //               arr[j + 1] = key;
  //               i++;
  //       }
    
		int n = arr.length; 
		for (int i = 1; i < n; i++) { 
			int key = arr[i]; 
			int j = i - 1; 
			while (j >=0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 

	static void printArray(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
		System.out.println(); 
	} 

}
