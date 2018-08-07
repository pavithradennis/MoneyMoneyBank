package MoneyMoneyBank;

public class MMBankFactory extends BankFactory
{
@Override
public SavingsAcc getNewSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried)
{
	SavingsAcc savingsAcc = new MMSavingsAcc(accNo, accNm, accBal, isSalaried);
	return savingsAcc;
}

@Override
public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float CreditLimit)
{
	CurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal, CreditLimit);
	return currentAcc;
}
}
