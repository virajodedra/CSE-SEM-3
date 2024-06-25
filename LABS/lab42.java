import java.util.* ;
public class lab42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int  n= sc.nextInt();
        int arr[]=  new int[n];

        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter m value");
        int m= sc.nextInt();
    
        int arr2[]= new int[n-1];
        for( int i=0;i<n;i++){
            if(i==m||i>m){
                arr2[i]=arr[i+1];
            }
            else{
                arr2[i]=arr[i];
            }
        }

            for( int i=0;i<n-1;i++){
                System.out.println(arr2[i]);
            }
        }
    }