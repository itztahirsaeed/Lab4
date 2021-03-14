package homeAc;

public class AccountMain {

	public static void main(String[] args) {
		Account a=new Account(5000);
		a.display();
		System.out.println("Depositing 150");
	
		a.deposit(150);
		a.display();

		System.out.println("Withdrawing 500");

		a.withdraw(500);
		a.display();
		System.out.println("\nNOW FOR ACCOUNT 2");
		Account a1=new Account(5000);
		a1.display();
		System.out.println("Depositing 250");
		
		a1.deposit(250);
		a1.display();
		System.out.println("Withdrawing 200");
		a1.withdraw(300);
		a1.display();
		

	}

}
