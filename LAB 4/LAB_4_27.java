import java.util.*;
public class LAB_4_27 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ' ){
                str = str.replace(str.charAt(i),str.charAt(i));
            }
            else{
                if(str.charAt(i)>= 'A' && str.charAt(i)<='Z'){

                str = str.replace(str.charAt(i), (char)(str.charAt(i)-32));

                }
                else if(str.charAt(i)>='a' && str.charAt(i)<='z'){

                str = str.replace(str.charAt(i), (char)(str.charAt(i)+32));
                
                }

            }
            
        }

        System.out.println(str);

    }
    
}


// import java.util.Scanner;
// public class LAB_4_27 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string:");
//         String str = sc.nextLine();
//         char[] charArray = str.toCharArray();
//         for(int i = 0; i < charArray.length; i++) {
//             char ch = charArray[i];
//             if(ch >= 'A' && ch <= 'Z') {
//                 charArray[i] = (char)(ch + 32);
//             } else if(ch >= 'a' && ch <= 'z') {
//                 charArray[i] = (char)(ch - 32);
//             }
//             // Spaces and other characters remain unchanged
//         }
//         String result = new String(charArray);
//         System.out.println(result);
//     }
// }

