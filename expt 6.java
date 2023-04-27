1.a
import java.util.*;
class exception
{ 
     public static void main(String args[])throws ArithmeticException
     {
       int i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two integers");
       int n=sc.nextInt();
       int p=sc.nextInt();
       System.out.println("result:"+n/p);
     }
 }    
 Enter two integers
2
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception.main(exception.java:11)
b.import java.util.*;
class exception1
{
    public static void main(String args[]) throws Exception
    {
       int i;
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the number of elements in the array");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter the elements in the array");
       for(i=0;i<n;i++)
       {
          a[i]=sc.nextInt();
       }
       for(i=0;i<=a.length;i++)
       System.out.println(a[i]);  
     }  
 }   
 Enter the number of elements in the array
3
Enter the elements in the array
1
2
3
1
2
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at exception1.main(exception1.java:17)
c.import java.io.*;
class  cde
{
	public static void main(String[] args) throws Exception
	{
		
		
			FileInputStream fin = new FileInputStream("test3.txt");
			int i;
			while((i=fin.read())!=-1)
				System.out.println((char)i);
			fin.close();
		
		
		
		
		
	}
}


OUTPUT
java.io.FileNotFoundException: test 3.txt (No such file or directory)
2.
import java.util.*;
class BalanceException extends Exception
{
	BalanceException(String str)
	{
	    super(str);
	}
}
public class Main
{
	public static void main(String[] args ) throws MinimumBalanceException
	{
		try{
		    int a = 100;
		    if(a<500)
			  throw new MinimumBalanceException("\n LOW BALANCE!!!");
		
		}
		catch(MinimumBalanceException e)
		{
			 System.out.println(e);
			 
			 
		}
	}
}

/*
OUTPUT
MinimumBalanceException: 
 LOW BALANCE!!!
