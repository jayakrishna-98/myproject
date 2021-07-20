package project;
import java.util.Scanner;
public class atm1 {
	 int balance = 5000, withdraw, deposit;
    Scanner s = new Scanner(System.in);
    void cashWithdraw()
    {
    	System.out.print("Enter money to be withdrawn:");
        withdraw = s.nextInt();
        if(balance >= withdraw)
        {
            balance = balance - withdraw;
            System.out.println("Please collect your money");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
     
    }
    void deposit()
    {
    	System.out.print("Enter money to be deposited:");
        deposit = s.nextInt();
        balance = balance + deposit;
        System.out.println("Your Money has been successfully depsited");
        System.out.println("");
      
    }
    void balanceEnquiry()
    {
    	System.out.println("Balance : "+balance);
        System.out.println("");
        
    }
    void pinChange()
    {
    	 System.out.println("please enter your pin");
    	 int b1=s.nextInt();
    	 System.out.println("please enter your otp from your registered mobile phone number");
    	 int b2=s.nextInt();
    	 System.out.println("please enter your new pin");
    	 int b3=s.nextInt();
    	 System.out.println("your pin has changed successfully");
    	 System.out.println("thank u for using this atm ");
    	 System.out.println("please remove your card ");
    }
    void transfer()
    {
    	int balance =5000;
    	 System.out.println("please enter transferring account number ");
    	 
    	 int d1=s.nextInt();
    	 System.out.println("please enter amount ");
    	 int transfer = s.nextInt();
         if(balance >= transfer)
         {
             balance = balance -transfer;
             System.out.println(" money trannsferred to other account");
         }
         else
         {
             System.out.println("Insufficient Balance");
         }
         System.out.println("");
         System.out.println("press 1  for checking new balance");
         int c5=s.nextInt();
         
         System.out.println("remaing balance is "+balance);
         
    	 
    	 System.out.println("thank u for using this atm ");
    	 System.out.println("please remove your card ");
    }
   
    

}
