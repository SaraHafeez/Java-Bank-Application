
public class OnLineAccountnew extends Accountnew
{
	private float minimumBalance;
	public OnLineAccountnew()
	{
		minimumBalance=500;
	}
	public OnLineAccountnew(String own,float bal,String pass)
	{
		super(own,bal,pass);
		minimumBalance=500;
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
			System.out.println("Check if values are negative or Verify password\n");
		
	}

	@Override
	public void withdrawal(float wdraw,String pass2) {
		if((balance-wdraw>minimumBalance) && (password==pass2))
		{
      System.out.println("Login Sucessful");
			balance-=wdraw;		
			System.out.println("Amount "+wdraw +" withdrawn from Accountnew Number : "+accNo+"\n");
		}
		else
		{
			balance-=25;
			System.out.println("Check your balance or Password\n");
		}
	}
	public String toString()
	{
		String disp="";
		if(balance<minimumBalance)
			disp="Accountnew Number : "+accNo+ " - $25 fee has been already been subtracted needs to alert the customer.\n";
		return disp;
			
	}
}
