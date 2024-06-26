import java.util.*;
class SwapFunc
{
    int a,b;
    public  void swap(SwapFunc swp)
    {
        int temp;
        temp=swp.a;
        swp.a=swp.b;
        swp.b=temp;
    }
    public class lab_5_33{
    public static void main(String s[])
    {
            SwapFunc objSwp= new SwapFunc();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter first  number: ");
            objSwp.a=sc.nextInt();    
            System.out.print("Enter second number: ");
            objSwp.b=sc.nextInt();  
            objSwp.swap(objSwp);
            System.out.println("After swapping  First Number: " + objSwp.a + "\n ");
            System.out.println("After swapping  Second Number: " + objSwp.b + "\n ");
       
    }
}
}
