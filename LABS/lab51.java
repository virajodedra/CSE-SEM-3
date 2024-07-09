import java.util.*;
public class lab51 {
    public static void main(String[] args) {
        int arr1[][]= new int[2][2];
        System.out.println(" add first matrix:");
        int arr3[][]= new int[2][2];
        Scanner Sc = new Scanner(System.in);


    for (int i=0; i<2; i++){
        for(int j=0;j<2;j++){
            arr1[i][j]= Sc.nextInt();

    }    
 }
        int arr2[][]= new int[2][2];
        System.out.println(" add second matrix:");
    for (int i=0; i<2; i++){
        for(int j=0;j<2;j++){
            arr2[i][j]= Sc.nextInt();
}
}
System.out.println(" addition of both matrices:");
    for (int i=0; i<2; i++){    
        for(int j=0;j<2;j++){
            arr3[i][j]=arr1[i][j]+arr2[i][j];
            System.out.println(arr3[i][j]+"");
        }
    }
}
}