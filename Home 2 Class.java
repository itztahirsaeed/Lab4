package homeAc;

public class Account {
private int balance;
public Account(int x)
{
	balance=x;
}
public void deposit(int d)
{
	balance=balance+d;
	
}

public void withdraw(int w)
{
	balance=balance-w;
	
}
public void display()
{
	System.out.println("Current balance is: "+balance);
}

}
