import java.util.*;

public class  NameSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
