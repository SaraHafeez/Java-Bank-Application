
public class SavingsAccountnew extends Accountnew
{
	public float overdraft;
	public SavingsAccountnew()
	{
		overdraft=-1000;
	}
	public SavingsAccountnew(String own,float bal,String pass)
	{
		super(own,bal,pass);
		overdraft=-1000;
	}
	@Override
	public void deposit(float dep,String pass1) {
		if((password==pass1) && (dep>0))		
		{
      System.out.println("Login Sucessful");
			balance+=dep;
			System.out.println("Amount "+dep +" deposited to Accountnew Number : "+accNo+"\n");
		}
		else
			System.out.println("No negative amount or check password\n");
	}

	public void withdrawal(float wdraw,String pass1) {
		if((balance-wdraw>0)&& (password==pass1) )
		{
      System.out.println("Login Sucessful");
			balance-=wdraw;		
		
			System.out.println("Amount "+wdraw +" withdrawn from Accountnew Number : "+accNo+"\n");
		}
		else
		{
			balance-=wdraw;
			overdraft+=30;
			System.out.println("You are in Overdraft and a $30 fee has been already been incurred. Or check your password");
         
		}
		
	}
	@Override
	public String toString()
	{
		String disp="";
		if(balance<0)
			disp="Accountnew Number : "+accNo+ " - is in Overdraft and a $30 fee has been already been incurred.\n";
		return disp;
			
	}
}
