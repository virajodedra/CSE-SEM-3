

import java.util.*;
// Create a class BankAccount with attributes like account number, balance,
// account holder and name. Create an array of BankAccount objects to store
// bank accounts. Implement methods to deposit money, withdraw money and
// check balance.

 //made by me ODEDRA VIRAJ >.

 class BankAccount{
    int ActNumber;
    double balance;
    double amount;
    double w_ammount;
    String actHolder;
    String name;
    

    public BankAccount() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the act no :"); 
       ActNumber = sc.nextInt();
       System.out.println("Enter the name of account holder :");
       String actHolder = sc.next();
       System.out.println("Enter the name :");
       String name = sc.next();
       
       System.out.println("Enter your BALANCE :");
       balance = sc.nextDouble();    

          }



    public double depositMoney() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount to be deposited :");
       double amount = sc.nextDouble(); 
       balance = balance + amount;

       
        return balance;
    }

        public void  printDeposit(double balance){


            System.out.println("the deposited balance   is :"  +balance);
        }

        public double withdrawMoney() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to be withdrawlled :");
            double w_ammount  = sc.nextDouble(); 
            balance = balance - w_ammount;

            if (w_ammount>balance) {

                System.out.println("Insufficient Balance");
                
                while(balance < w_ammount) {
                    System.out.println("Enter the ammount once more : ");
                    w_ammount  = sc.nextDouble();
                    balance = balance - w_ammount;
                }
                
            }
            
             return balance;
            
             
         }
     
             public void  printWithdraw(double balance){
     
     
                 System.out.println("the deposited balance   is :"  +balance);
             }

 }

public class Lab_6_37 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of BankAccounts :");
        int n = sc.nextInt();
        BankAccount[] s1 = new BankAccount[n];

        System.out.println("Enter 1  for deposit the money and 2 for withdraw the money :");
        int choice = sc.nextInt();

        for(int j=0; j<n;j++) {
            
            s1[j] = new BankAccount();
            
            if(choice == 1){
                // s1[j].depositMoney();
                s1[j].printDeposit(s1[j].depositMoney());
            }
            else{
                // s1[j].withdrawMoney();
                s1[j].printWithdraw(s1[j].withdrawMoney());
            }
        
        }
    
    }

}
