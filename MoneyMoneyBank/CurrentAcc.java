package MoneyMoneyBank;
//abstract class to specify the case for current account
public abstract class CurrentAcc extends BankAcc
{
 private final float creditLimit;

public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal); //inputting credit limit via constructor
	this.creditLimit = creditLimit;
}

@Override
abstract public void withdraw(float money);

@Override
public String toString()
{
	return "CurrentAcc [creditLimit=" +creditLimit + ", toString()=" + super.toString() + "]";
	
}

public float getCreditLimit() { //to access credit limit in the child class
	return creditLimit;
}

}
