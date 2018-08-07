package MoneyMoneyBank;
//abstract class to represent a bank account
public abstract class BankAcc
{
 private int accNo;
 private String accNm;
 private float accBal;
 
public BankAcc(int accNo, String accNm, float accBal) { //parameterized constructor
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}

//getters and setters
  public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getAccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}
public void deposit(float money)
  {
	  accBal += money;
  }
  
  abstract public void withdraw(float money); //abstract method 
  
  @Override
  public String toString()
  {
	  return "BankAcc [accNo=" + accNo + ", accNm= " + accNm + ", accBal=" + accBal + "] ";
  }
  
}










