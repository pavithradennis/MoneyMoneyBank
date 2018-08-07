package MoneyMoneyBank;
//class representing withdrawal in case of savings account
public class MMSavingsAcc extends SavingsAcc
{
 private boolean isSalaried; //recreating again to extend the scope
 private static final float MINBAL = 1000; //reinitializing because "final"
 

public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal, isSalaried);
	this.isSalaried = isSalaried;
}

@Override
public void withdraw(float money) //withdraw method in case of savings account
{
	if(isSalaried)
	{
		if((getAccBal()-money)>=0)
		{
			setAccBal(getAccBal()-money);
		}
		else
		{
			System.out.println("Insufficient funds. Withdrawal below min balance not allowed");
		}
	}
	else
	{
		if((getAccBal()-money)>=MINBAL)
		{
			setAccBal(getAccBal()-money);
		}
		else
		{
			System.out.println("Insufficient funds. Withdrawal below min balance not allowed");
		}
	}
}
 
@Override
public String toString()
{
	return "MMSavingsAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + "]";
}

}
