package transection;

public class Transaction implements Bank{
	public void deposit(Account ac, int amount) {
		ac.Balance+=amount;
		System.out.println("Deposit done!");
		
	}

	
	public void widraw(Account ac, int amount) {
		
		ac.Balance+=amount;
	}


	public void widraw(Account ac) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void widraw() {
		// TODO Auto-generated method stub
		
	}
}
