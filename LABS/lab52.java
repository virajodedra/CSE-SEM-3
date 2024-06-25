import java.util.Scanner;

public class lab52 {
    public static void main(String[] args) {
        int arr1[][] = new int[3][2];
        System.out.println(" add first matrix:");
        int arr3[][] = new int[3][3];
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int arr2[][] = new int[2][3];
        System.out.println(" add second matrix:"); 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp = 0;
                for (int k = 0; k < 2; k++) { 
                    temp += arr1[i][k] * arr2[k][j];

                }
                arr3[i][j] = temp;
                System.out.println(arr3[i][j]);
            }
        }


    }
}
