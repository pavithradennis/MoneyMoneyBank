package MoneyMoneyBank;
//main class to call the different child classes
public class EntryPoint
{

	public static void main(String[] args)
	{
		BankFactory mmBankFactory = new MMBankFactory();
		SavingsAcc mmSavingAcc = mmBankFactory.getNewSavingsAcc(101, "Pavithra", 5000, true);
		CurrentAcc mmCurrentAcc = mmBankFactory.getNewCurrentAcc(101,"Pavithra",3000,10000);
		
		//different scenarios
		mmSavingAcc.withdraw(5000);
		System.out.println(mmSavingAcc);
		mmSavingAcc.withdraw(5000);
		System.out.println(mmSavingAcc);
		
		mmCurrentAcc.withdraw(5000);
		System.out.println(mmCurrentAcc);
		mmCurrentAcc.withdraw(8000);
		System.out.println(mmCurrentAcc);
		
		mmCurrentAcc.deposit(8000);
		System.out.println(mmCurrentAcc);
		
		SavingsAcc mmSavingsAcc = mmBankFactory.getNewSavingsAcc(102, "Pavithra", 5000, false);
		mmSavingsAcc.withdraw(3000);

	}

}
