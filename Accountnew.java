 import java.text.NumberFormat;
public class Accountnew
{
	private String owner;
	private static int accountNo=12345;
	public int accNo;
	protected float balance;
	private double interest=0.05;
   protected String password;
	public Accountnew()
	{
		accountNo++;	
		accNo=accountNo;
		balance=0;
	}
	public Accountnew(String own,float bal,String pass)
	{
		owner=own;
		accountNo++;
		accNo=accountNo;
		balance=bal;
      password=pass;
	}
	public void setOwner(String own)
	{
		owner=own;
	}
  
	public int getAccountnewNo()
	{
		return accNo;
	}
	public String getOwner()
	{
		return owner;
	}
	public float getBalance()
	{
		return balance;
	}
	public void deposit(float dep,String pass1)
	{
   
    if ((password==pass1) && (dep>0))
{
System.out.println("Login Sucessful");
			balance+=dep;
			System.out.println("Amount "+dep +" deposited to Accountnew Number : "+accNo+"\n");
		}
		else
			System.out.println("Negative values cannot be deposited or Check Password\n");
	}
   /*else
   System.out.println("Please Enter the Correct Password Cannot Deposit");*/


	public void withdrawal(float wdraw,String pass1)
	{
   if (password==pass1 && (balance-wdraw>0))
     {System.out.println("Login Sucessful");
          
			balance-=wdraw;		
			System.out.println("Amount "+wdraw +" withdrawn from Accountnew Number : "+accNo+"\n");
		}
else
			System.out.println("Balance is limited to withdraw or check password\n");
	}
   /*else
   System.out.println("Please Enter the Correct Password Cannot withdraw");*/

	public String toString()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance ();
		String toScreen ;
		toScreen = "\n" + accNo + " :\t" + formatter.format (balance) +"\n";
		return toScreen;
	}
	
}
