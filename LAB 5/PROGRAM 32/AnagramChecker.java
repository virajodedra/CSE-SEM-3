import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the  array of String :");
        int n = sc.nextInt();

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the (" + i + ") element of the array :");
            arr[i] = sc.next();
        }
        String s1 = " ";

        int a = (int) (Math.random() * n);

        for (int i = 0; i < n; i++) {
            if (i == a) {
                s1 = arr[i];
                System.out.println(arr[i] + " ");
                System.out.println(s1 + " ");
            }
        }

        // System.out.println("Enter the first string:");
        // String s1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.println("Enter the second string:");
        String s2 = sc.next().toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM");
        } else {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println("ANAGRAM");
            } else {
                System.out.println("NOT ANAGRAM");
            }
        }

        sc.close();
    }
}
