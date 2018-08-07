package MoneyMoneyBank;
//
public class MMCurrentAcc extends CurrentAcc
{
 public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
 {
	 super(accNo, accNm, accBal, creditLimit);
 }
 
 @Override
 public void withdraw(float money)
 {
	 float CL = getCreditLimit();
	 float AB = getAccBal();
	 if(((getAccBal()+ getCreditLimit())-money)>=0)
	 {
		 setAccBal(getAccBal()-money);
	 }
	 else
	 {
		 System.out.println("Insufficent funds.");
		 System.exit(0);
	 }
 }
 
 @Override
 public String toString()
 {
	 return "MMCurrentAcc [toString()=" + super.toString() + "]";
 }
}
