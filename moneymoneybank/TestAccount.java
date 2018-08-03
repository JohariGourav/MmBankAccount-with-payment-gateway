package moneymoneybank;

//Class to test Account functionalities
public class TestAccount {

	public static void main(String[] args) {
		// creating 1st object with initial balance
		Account rita = new Account("Rita", 10000);
		System.out.println(rita);

		// getting next account number after 1st object
		int next = Account.getNextAccountNumber();
		System.out.println(next);

		// creating 2nd object with zero balance
		Account jay = new Account("Jay");
		System.out.println(jay);

		// getting next account number after 2nd object
		next = Account.getNextAccountNumber();
		System.out.println(next);

		// transferring balance test 1
		String result = rita.transaction(jay, 200);
		System.out.println(result);

		// Transferring balance test 2
		result = rita.transaction(jay, rita.getBalance());
		System.out.println(result);

		// Checking updated balance
		System.out.println(rita);
		System.out.println(jay);
	}

}