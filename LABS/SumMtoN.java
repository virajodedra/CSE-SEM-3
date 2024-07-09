import java.util.Scanner;
public class SumMtoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int m = scanner.nextInt();
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is :" + sum);
        
    }
    
}
