import java.util.*;
public class FabonacciSeries {

    
    public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of terms which you want to print in fabonacci");
        
        int n=s.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
           int c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
        
    }
    
}