public class SumOfSer {
    public static void main(String[] args) {
      Scanner sc =  new Scannner(System.in);
      System.out.println("Enter the size of the series :");
        int n = sc.nectInt(); 
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
