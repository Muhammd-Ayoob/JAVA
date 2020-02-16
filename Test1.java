import java.util.*;
class BankAccount
{
	private String accountHolder;
	private int age;
	private String bank;
	private int accountNo;
	private int balance;
	
	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder=accountHolder;
	}
	public String getAccountHolder()
	{
		return accountHolder;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setBank(String bank)
	{
		this.bank=bank;
	}
	public String getBank()
	{
		return bank;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
}
class AccountManagement
{
	BankAccount b=new BankAccount();
	Scanner s=new Scanner(System.in);
	
	private String accountHolder;
	private int age;
	private String bank;
	private int accountNo;
	private int balance;
	
	void menu()
	{
		System.out.println("1: Creat account");
		System.out.println("2: Delete Account");
		System.out.println("3: Deposit ammount");
		System.out.println("4: Withdraw ammount");
		System.out.println("5: view information of account holder");
		System.out.println("6: exit");
		
		System.out.println("Enter your choice");
		int n=s.nextInt();
		
		if(n==1)
		{
			creatAccount();
		}
		else if(n==2)
		{
			deleteAccount();
		}
		else if(n==3)
		{
			depositAmmount();
		}
		else if(n==4)
		{
			withdrawAmmount();			
		}
		else if(n==5)
		{
			veiwInformation();
		}
		else
		{
			exit();
		}
					
	}
	void creatAccount()
	{
		System.out.println("Enter name");
		accountHolder=s.next();
		b.setAccountHolder(accountHolder);
		
		System.out.println("Enter age");
		age=s.nextInt();
		b.setAge(age);
		
		System.out.println("Enter Bank name");
		bank=s.next();
		b.setBank(bank);
		
		System.out.println("Enter Account number");
		accountNo=s.nextInt();
		b.setAccountNo(accountNo);
		
		System.out.println("Enter balance");
		balance=s.nextInt();
		b.setBalance(balance);
		System.out.println();
		
		System.out.println("      <<<:Account created succesfully:>>>");
		
		System.out.println();
		System.out.println();
		
		menu();
	}
	void deleteAccount()
	{
		b.setAccountHolder(null);
		b.setAge(0);
		b.setBank(null);
		b.setAccountNo(0);
		b.setBalance(0);
		
		System.out.println();
		
		System.out.println("         <<<:Account deleted succesfully:>>>");
		
		System.out.println();
		System.out.println();
		
		menu();
	}
	void depositAmmount()
	{
		System.out.println("Enter ammount to deposit");
		int ammount=s.nextInt();
		
		balance=balance+ammount;
		b.setBalance(balance);
		System.out.println();
		
		System.out.println("      <<<:ammount deposited succesfully:>>>");
		
		System.out.println();
		System.out.println();
		
		menu();
	}
	void withdrawAmmount()
	{
		System.out.println("Enter ammount to withdraw");
		int ammount=s.nextInt();
		if(balance>=ammount)
		{
			balance=balance-ammount;
			b.setBalance(balance);
			
			System.out.println("        <<<:ammount withdraw succesfully:>>>");
		}
		else
		{
			System.out.println("You have'nt enough balance to withdraw");
		}
		System.out.println();
		System.out.println();
		
		menu();
	}
	void veiwInformation()
	{
		System.out.println("      <<<:Displaying information of account:>>>");
		System.out.println();
		System.out.println("      Name: "+b.getAccountHolder());
		System.out.println("      Age: "+b.getAge());
		System.out.println("      Bank name: "+b.getBank());
		System.out.println("      User account number: "+b.getAccountNo());
		System.out.println("      Balance in account: "+b.getBalance());
		
		System.out.println();
		System.out.println();
		
		menu();
	}
	void exit()
	{}
}
class Test1
{
	public static void main(String args[])
	{
		AccountManagement am=new AccountManagement();
		
		System.out.println();
		System.out.println();
		
		System.out.println("<<<<:Welcome to Bank:>>>>");
		
		System.out.println();
		System.out.println();
		
		am.menu();
	}
}
