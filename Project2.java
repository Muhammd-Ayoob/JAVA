package project2;

import java.util.*;
import java.time.LocalDate;
//import static project2.ManagingRecipt.p1;
class Products
{
    private String name;
    private String id;
    private int price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", id=" + id + ", price=" + price + ", quantity=" + quantity + '}';
    }
    

   
    
    
}
class ManagingProducts
{
    ArrayList<Products> list1=new ArrayList<Products>();
  static ManagingRecipt r1=new ManagingRecipt();
    public void addProducts()
    {
        
        Products p1=new Products();
        p1.setName("A3s");
        p1.setId("bcd");
        p1.setPrice(24000);
        p1.setQuantity(10);
        list1.add(p1);
        
        Products p2=new Products();
        p2.setName("A5s");
        p2.setId("cde");
        p2.setPrice(25000);
        p2.setQuantity(10);
        list1.add(p2);
        
        Products p3=new Products();
        p3.setName("F9");
        p3.setId("axz");
        p3.setPrice(30000);
        p3.setQuantity(10);
        list1.add(p3);
        
        
        
        Products p4=new Products();
        p4.setName("F10");
        p4.setId("xyz");
        p4.setPrice(35000);
        p4.setQuantity(10);
        list1.add(p4);
        
        Products p5=new Products();
        p5.setName("F11");
        p5.setId("ebd");
        p5.setPrice(40000);
        p5.setQuantity(10);
        list1.add(p5);
        
        Products p6=new Products();
        p6.setName("F5");
        p6.setId("dfe");
        p6.setPrice(25000);
        p6.setQuantity(10);
        list1.add(p6);
        
        Products p7=new Products();
        p7.setName("A37");
        p7.setId("bde");
        p7.setPrice(18000);
        p7.setQuantity(10);
        list1.add(p7);
        
        Products p8=new Products();
        p8.setName("A5");
        p8.setId("bcd");
        p8.setPrice(27000);
        p8.setQuantity(10);
        list1.add(p8);
        
        Products p9=new Products();
        p9.setName("A83");
        p9.setId("acd");
        p9.setPrice(22000);
        p9.setQuantity(10);
        list1.add(p9);
        
        Products p10=new Products();
        p10.setName("F9");
        p10.setId("abd");
        p10.setPrice(31000);
        p10.setQuantity(10);
        list1.add(p10);
        r1.menu();
        
    }
    public void show()
    {
        for(Products p1:list1)
        {
            System.out.println(p1);
        }
        System.out.println();
        System.out.println();
      r1.menu();
    }   
}



class Customer
{
    private String name;
    private String id;
    private int pNo;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getpNo() {
        return pNo;
    }

    public void setpNo(int pNo) {
        this.pNo = pNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", id=" + id + ", pNo=" + pNo + ", address=" + address + '}';
    }
    
    
}


class Recipt
{
    private String product;
    private int quantity;
    private int price;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product:" + product + "     quantity:" + quantity + "    price:" + price;
    }
    
    
}
class ManagingRecipt
{
 Customer c=new Customer();
 static Scanner s=new Scanner(System.in);
 static Products p=new Products();
 static ManagingProducts p1=new ManagingProducts();
 ArrayList<Customer> list2=new ArrayList<Customer>();
 ArrayList<Recipt> list3=new ArrayList<Recipt>();
int tPrice=0;
 
 
 public void addRecipt()
 {
     System.out.println("ENTER CUSTOMER NAME");
     String name=s.next();
     c.setName(name);
     
     System.out.println("ENTER CUSTOMER ID");
     String id=s.next();
     c.setId(id);
     
     System.out.println("ENTER CUSTOMER PHONE NUMBER");
     int pNo=s.nextInt();
     c.setpNo(pNo);
     
     System.out.println("ENTER CUSTOMER ADDRESS");
     String address=s.next();
     c.setAddress(address);
     list2.add(c);
     String option=null;
     
     do
     {
         Recipt r=new Recipt();
         boolean b=true;
         boolean c=true;
        System.out.println("WHICH PRODUCT YOU WANT TO BUYE?");
        String product=s.next();
        for(Products p:p1.list1)
        {
            if(p.getName().equals(product))
            {
            
                r.setProduct(product);
                r.setPrice(p.getPrice());
                 b=true;
            
            do
            { 
                System.out.println("ENTER QUANTITY:");
                int quantity=s.nextInt();
                if(p.getQuantity()>=quantity&&quantity>0)
                {
                    
                    c=true;
                    r.setQuantity(quantity);
                    p.setQuantity(p.getQuantity()-quantity);
                    tPrice+=p.getPrice()*quantity;
                 
                    list3.add(r);
                    if(p.getQuantity()==0)
                    {
                        p1.list1.remove(p);
                    }
                }
                else
                {
                    System.out.println("TOO MUCH QUANTITY.*PRESENT QUANTITY OF "+product+"s IS "+p.getQuantity());
                    System.out.println("PLEASE TRY WITH VALID QUANTITY");
 
                    c=false;
                 
                }
            }
            while(c==false);
            break;
        }
         
         else
          {
            b=false;
          }
     }
     if(b==false)
        {
         System.out.println("###YOUR ENTERED PRODUCT DOES NOT EXIST###");
        }
     System.out.println("DO YOU WANT TO BUYE OTHER PRODUCTS??");
    option=s.next();
   }
    while(option.equals("yes"));
     System.out.println();
     System.out.println("SHOPPING RECIPT");
     System.out.println("***************");
     System.out.println();
     show();

}
 public void exit()
{}
 
 public void show()
 {
     Random random=new Random();
     int orderNo=random.nextInt(10000);
     LocalDate date=LocalDate.now();
     int i=1;
     System.out.println("CUSTOMER NAME: "+c.getName()+"  Date: "+date+"  Order no:  "+orderNo);
     for(Recipt r:list3)
     {
         
         System.out.print(i+" ");
        
         
         System.out.println(r);
         i++;
         
     }
     System.out.println();
     System.out.println("Total price = "+tPrice);
     System.out.println();
     System.out.println();
    menu();
 }
 
 
 public void menu()
 
 {
     System.out.println("<<<****WELCOME TO OPOO MOBILE SHOP****>>>");
     System.out.println();
     System.out.println("1:ADD CUSTOMER");
     System.out.println("2:TO SHOW PRODUCTS DETAIL");
     System.out.println("3:EXIT");
     System.out.println("4:ADD CUSTOMER");

     System.out.println();
     System.out.println("ENTER YOUR CHOICE");
     int n=s.nextInt();
     
     

    if(n==1)
    {
       addRecipt();                                                                    //p1.addProducts();
    }
    else if(n==2)
    {
        p1.show();
    }
    else if(n==3)
    {
        exit();
    }
    else if(n==4)
    {
        p1.addProducts();
    }
    else
    {
        System.out.println("###INVALID ENTRY###");
    }

   }
 
 

}

public class Project2 {

    
    public static void main(String[] args) {
       
        
       ManagingRecipt r=new ManagingRecipt();
       //p1.addProducts();
       r.menu();
    }
}