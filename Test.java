import java.util.*;
class University
{
	private String name;
	private String rollno;             //Private variables to achieve encapsulation.
	private int fees;
	private String month;
	private int year;
	
	public void setName(String name)    
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setRollno(String rollno)
	{
		this.rollno=rollno;
	}
	public String getRollno()
	{
		return rollno;
	}
	
	public void setFees(int fees)
	{
		this.fees=fees;
	}
	public int getFees()
	{
		return fees;
	}
	
	public void setMonth(String month)
	{
		this.month=month;
	}
	public String getMonth()
	{
		return month;
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
}
class Methods
{
	University u=new University();
	
	Scanner s=new Scanner(System.in);
	
	private String name;
	private String rollno;
	private int fees;
	private String month;
	private int year;
	
	//Menu Method
	void menu()                                  
	{
		System.out.println("1:Registeration");
		System.out.println("2:Delete");
		System.out.println("3:Update");
		System.out.println("4:View");
		System.out.println("5:Exit");
		
		System.out.println("Enter your selection");
		int n=s.nextInt();
		if(n==1)
		{
			register();
		}
		else if(n==2)
		{
			delete();
		}
		else if(n==3)
		{
			update();
		}
		else if(n==4)
		{
			view();
		}
		else
		{
			exit();
		}
	} 
    //Student Registeration method	
	void register()                              
	{
		System.out.println("Enter name");
		name=s.next();
		u.setName(name);
		
		System.out.println("Enter rollno");
		rollno=s.next();
		u.setRollno(rollno);
		
		System.out.println("Enter fees");
		fees=s.nextInt();
		u.setFees(fees);
		
		System.out.println("Enter Month");
		month=s.next();
		u.setMonth(month);
		
		System.out.println("Enter year");
		year=s.nextInt();
		u.setYear(year);
		System.out.println("<<<<Registered succesfully>>>");
		System.out.println();
		System.out.println();
		
		menu();
	}
	//Method to delete student data
	void delete()
	{
		u.setName("null");
		u.setRollno("null");
		u.setFees(0);
		u.setMonth("null");
		u.setYear(0);
		System.out.println("<<<<Deleted succesfully>>>");
		System.out.println();
		System.out.println();
		menu();
	}
	//Method to update Student's data.
	void update()
	{
		System.out.println("Enter roll number you want to update");
		String rollnum=s.next();
		if(rollnum.equals(rollno))
		{
		System.out.println("Enter name");
		String name=s.next();
		u.setName(name);
		
		System.out.println("Enter rollno");
		String rollno=s.next();
		u.setRollno(rollno);
		
		System.out.println("Enter fees");
		int fees=s.nextInt();
		u.setFees(fees);
		
		System.out.println("Enter Month");
		String month=s.next();
		u.setMonth(month);
		
		System.out.println("Enter year");
		int year=s.nextInt();
		u.setYear(year);
		System.out.println("<<<<Updated succesfully>>>");
		}
		else
		{
		System.out.println("Your entered roll number is not registered");
		}
		System.out.println();
		System.out.println();
		menu();
	}
	//Method to view Student's information.
	void view()
	{
		System.out.println("            Information about student");
		System.out.println();
		System.out.println("            Name: "+u.getName());
		System.out.println("            Rollno: "+u.getRollno());
		System.out.println("            Fees: "+u.getFees());
		System.out.println("            Month: "+u.getMonth());
		System.out.println("            Year: "+u.getYear());
		System.out.println();
		System.out.println();
		
		menu();
	}
	//Method to exit program.
	void exit()
	{}
}
//Main method class.
class Test
{	
	public static void main(String args[])
	{
		System.out.println();
		System.out.println();
		System.out.println("<<<<Welcome to my University>>>");
		System.out.println();
		System.out.println();
		Methods m=new Methods();
		m.menu();
	}
}