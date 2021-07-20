
package project;
import java.util.Scanner;


public class atmI extends atm1
{
	public static void main(String args[])
			
	{
		
		
       int pin=1234;
		atm1 a1=new atm1();
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to  hdfc atm");
		System.out.println("please insert your card");
		String n=sc.nextLine();
		System.out.println("please enter your pin");
		int a=sc.nextInt();
		if(a==pin)
		{
			
		
		System.out.println("please select your account type ");
		System.out.println("press 1  for current type");
		System.out.println("press 2  for savings type");
		int b=sc.nextInt();
		}
		else 
		{
			System.out.println("please enter correct pin");
			 System.exit(0);
			
		}
		System.out.println("please select yourmode of transaction ");
		System.out.println("press 1  for  cash withdraw");
		System.out.println("press 2  for cash deposit ");
		System.out.println("press 3  for  balance enquiry");
		System.out.println("press 4 for  pin changing");
		System.out.println("press 5  for money transfer ");
		System.out.println("press 6 for exit ");
		int c=sc.nextInt();
		 switch(c)
         {
             case 1:
            	 a1.cashWithdraw();
            	
            	 System.out.println("press 1  for checking new balance ");
            	 int c1=sc.nextInt();
            	 a1.balanceEnquiry();
            	 System.out.println("thank u for using this atm ");
            	 System.out.println("visit again ");
            	 
            
             break;

             case 2:a1.deposit();
             System.out.println("press 1  for checking new balance");
             int c2=sc.nextInt();
        	 a1.balanceEnquiry();
        	 System.out.println("thank u for using this atm ");
        	 System.out.println("please remove your card ");
        	 break;
                    
             case 3 : 
            	 a1.balanceEnquiry();
            	 System.out.println("thank u for using this atm ");
            	 System.out.println("please remove your card ");
            	 break;
             case 4:
            	a1.pinChange();
            	 break;
             case 5:
            	a1.transfer();
            	 break;
              
             case 6:	 
            	 
             System.exit(0);
	     case default :  System.exit(0);
         }
}
}
