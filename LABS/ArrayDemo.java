import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int []m = new int[n];

        for(int i = 0; i < n; i++){
            m[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(m[i]);
        }

    }
    
}
