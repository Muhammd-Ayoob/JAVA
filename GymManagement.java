import java.util.*;
class GymManagement
{
	static GymManagement g=new GymManagement();
	
	static String str=" ";
	
	String name;
	
	int rollno;
	
	String month;
	
	int year;
	
	Scanner s=new Scanner(System.in);
	
	void menu()
	{
		System.out.println("1:Register");
		System.out.println("2:delete");
		System.out.println("3: update");
		System.out.println("4:view");
		System.out.println("5:exit");
		
		System.out.println("Enter your selection");
		int n=s.nextInt();
		
		if(n==1)
			g.register();
		else if(n==2)
			g.delete();
		else if(n==3)
			g.update();
		else if(n==4)
			g.view();
		else
			g.exit();
	}
	void register()
	{
		System.out.println("Enter name");
		name=s.next();
		
		System.out.println("Enter roll number");
		rollno=s.nextInt();
		
		System.out.println("Enter month");
		month=s.next();
		
		System.out.println("Enter year");
		year=s.nextInt();
		
		str+="Name :"+name+"\n"+"Roll no: "+rollno+"\n"+"Month: "+month+"\n"+"Year: "+year; 
		System.out.println(" Register Succesfully");
		
		System.out.println();
		System.out.println();
		
        g.menu();	
	}
	void delete()
	{
		name=null;
		rollno=0;
		month=null;
		year=0;
		
		String str3=" ";
		
		str+="Name :"+name+"\n"+"Roll no: "+rollno+"\n"+"Month: "+month+"\n"+"Year: "+year;
		
		str=str3;
		
		System.out.println(" Delete Succesfully");
		
		System.out.println();
		System.out.println();
		g.menu();
	}
	void update()
	{
	   System.out.println("Enter name");
		name=s.next();
		
		System.out.println("Enter roll number");
		rollno=s.nextInt();
		
		System.out.println("Enter month");
		month=s.next();
		
		System.out.println("Enter year");
		year=s.nextInt();
		
		String str1=" ";
		str1+="Name :"+name+"\n"+"Roll no: "+rollno+"\n"+"Month: "+month+"\n"+"Year: "+year;
		
		str=str1;
		
		System.out.println();
		System.out.println();
		
		g.menu();
	}
	void view()
	{
		System.out.println(str);
		System.out.println();
		System.out.println();
		
		g.menu();
	}
	void exit()
	{}
	
	public static void main(String args[])
	{
		System.out.println();
		System.out.println();
		System.out.println("<<<<<<<<Welcome to Gymnasium>>>>>>>>");
		

		System.out.println();
		System.out.println();
	
		g.menu();
	}
}