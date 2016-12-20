
public class OnLineAccountnewTest 
{
	public static void main(String[] args)
	{
		OnLineAccountnew[] AccountnewList=new OnLineAccountnew[5];		
		AccountnewList[0]=new OnLineAccountnew("Henry",50,"1234");
		AccountnewList[1]=new OnLineAccountnew("John",25,"4567");
		AccountnewList[2]=new OnLineAccountnew("Henry",150,"5678");
		AccountnewList[3]=new OnLineAccountnew("Stephen",100,"6788");
		AccountnewList[4]=new OnLineAccountnew("Bernard",75,"5555");
		
		AccountnewList[1].deposit(15,"4567");
		AccountnewList[3].withdrawal(30,"6788");
		AccountnewList[3].withdrawal(300,"6777");
		AccountnewList[1].deposit(-60,"4567");
	}
}
