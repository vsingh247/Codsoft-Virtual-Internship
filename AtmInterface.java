/*Codsoft Virtual Internship in Java Programming
 * TASK 3 : ATM INTERFACE
 * Author Name : Vivek Kumar Singh
 */

import java.util.Scanner;

class BankAccount
{
    double amount=0.0;
    
    public void withdraw(double amount)
    {
       if(this.amount<amount)
       {
        System.out.println("Insufficinet Balance");
        return;
       }
       this.amount-=amount;
       System.out.println("Withdrawal Successfull");
       System.out.println("Withdrawal Amount : "+amount);
       System.out.println("Current Balance   : "+this.amount);
    }

    public void deposit(double amount)
    {
      this.amount+=amount;
      System.out.println("Deposit Successfull");
      System.out.println("Deposit Balance   : "+amount);
      System.out.println("Current Balance   : "+this.amount);
    }

    public void checkBalance()
    {
        System.out.println("Current Balance : "+this.amount);
    }
   
}
public class AtmInterface
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int choice=0;
      double amount=0.0;
      
      BankAccount user = new BankAccount();
      while(choice!=4)
      {
        System.out.println("\n\n");
         System.out.println(" _____________________");
         System.out.println("|-- Operation Menu -- |");
         System.out.println("|---------------------");
         System.out.println("| 1. | Withdraw Money |");
         System.out.println("|---------------------");
         System.out.println("| 2. | Deposit Money  |");
         System.out.println("|---------------------");
         System.out.println("| 3. | Check Balance  |");
         System.out.println("|---------------------");
         System.out.println("| 4. |     Exit       |");
         System.out.println(" ---------------------");
         System.out.println("Enter Choice : ");
         choice = sc.nextInt();


         switch(choice)
         {
            case 1 : System.out.println("Enter Amount : ");
                      amount=sc.nextDouble();
                     user.withdraw(amount);
                     break;

            case 2 : System.out.println("Enter Amount : ");
                      amount=sc.nextDouble();
                     user.deposit(amount);
                     break;

            case 3 : user.checkBalance();
                     break;

            case 4 : System.out.println("--ThankYou!--");
            return;

            default : System.out.println("Invalid Choice. Choose Again!");
         }
      }
   }    
}
