package MoneyMoneyBank;
//abstract class to represent bank account of type savings
public abstract class SavingsAcc extends BankAcc
{
 private boolean isSalary;
 private static final float MINBAL = 1000;
 
public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalary) { //constructor
	super(accNo, accNm, accBal);
	this.isSalary = isSalary;
}
 
@Override
public abstract void withdraw(float money); //override abstract method

@Override
public String toString()
{
	return "SavingsAcc [isSalary=" + isSalary + "]";
}
 
}
