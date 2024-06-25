import java.util.Scanner;
public class AverageOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is :" + sum);
        System.out.println("The average is :" + sum / n);
        
    }
    
}
