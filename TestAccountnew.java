
public class TestAccountnew 
{
	public static void main(String[] args)
	{
		Accountnew[] AccountnewList=new Accountnew[5];		
		AccountnewList[0]=new Accountnew("Henry",50,"1234");
		AccountnewList[1]=new Accountnew("John",25,"3456");
		AccountnewList[2]=new Accountnew("Henry",150,"4567");
		AccountnewList[3]=new Accountnew("Stephen",100,"5678");
		AccountnewList[4]=new Accountnew("Bernard",75,"4567");
		
		AccountnewList[1].deposit(15,"3456");
		AccountnewList[3].withdrawal(30,"5677");
		AccountnewList[3].withdrawal(300,"5678");
		AccountnewList[1].deposit(-60,"1234");
		
		System.out.println("***********************************************\n");
		for(int i=0;i<AccountnewList.length;i++)
		{
			System.out.println(AccountnewList[i]);
		}
		System.out.println("***********************************************\n");
		System.out.println("Different Accountnew Holder List: ");
		for(int i=0;i<AccountnewList.length;i++)
		{
			for(int j=i+1;j<AccountnewList.length-1;j++)
			{
				if(AccountnewList[i].getOwner().equals(AccountnewList[j].getOwner()))
				{
					System.out.println(AccountnewList[i].getAccountnewNo()+"--"+AccountnewList[j].getAccountnewNo());
				}
			}
		}
	}
}
