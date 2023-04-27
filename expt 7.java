1.
import java.util.*;
class Square extends Thread
{
 Square(int y)
 {
 System.out.println("Square of " + y+ " = " + (y*y) );
 }
}
class Cube extends Thread
{
 Cube(int x)
 {
 System.out.println("Cube of " + x + " = " + (x*x*x) );
 }
}
class number extends Thread
{
 public void run()
 {
  Random sc = new Random();
  for(int i =0; i<5; i++) {
   int r = random.nextInt(100);
    System.out.println("Random Integer generated : " + r);
   if(r%2==0){
    Square s = new Square(r);
   }
   else{
    Cube c = new Cube(r);
   }
   try {
    Thread.sleep(1000);
   } 
   catch (InterruptedException ex) {
    System.out.println(ex);
   }
  }
 }
}
public class Main {
 public static void main(String args[])
 {
  number n = new number();
  n.start();
 }
}

/*
OUTPUT
Random Integer generated : 96
Square of 96 = 9216
Random Integer generated : 58
Square of 58 = 3364
Random Integer generated : 25
Cube of 25 = 15625
Random Integer generated : 57
Cube of 57 = 185193
Random Integer generated : 52
Square of 52 = 2704
*/
2.
import java.util.*;
class Customer
{
  int amount=10000;
  synchronized void withdraw(int amount)
     {  
         System.out.println("Going to Withdraw...");
         if(this.amount<amount)
            {
              System.out.println("Going to Withdraw..");
              try
                {
                  wait();
                }
              catch(Exception e)
                 {
                   System.out.println(e);
                 }
             }
          this.amount-=amount;
          System.out.println("Withdraw completed");
       }
    synchronized void deposit(int amount)
       {
         System.out.println("Going to deposit");
         this.amount+=amount;
         System.out.println("Deposit completed..");
         notify();
       }
 }
class MyThread1 extends Thread
{
  Customer c;
  MyThread1(Customer c)
    {
      this.c=c;
    }
  public void run()
    {
       c.withdraw(15000);
    }
}
class MyThread2 extends Thread
{
  Customer c;
  MyThread2(Customer c)
    {
      this.c=c;
    }
  public void run()
    {
       c.deposit(15000);
    }
}
public class Exp7_2
{
 public static void main(String args[])
  {
    Customer c= new Customer();
    MyThread1 t1=new MyThread1(c);
    MyThread2 t2=new MyThread2(c);
    t1.start();
    t2.start();
  }
}
/*
OUTPUT
Going to Withdraw...
Going to Withdraw..
Going to deposit
Deposit completed..
Withdraw completed
*/
3.
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		oddthread o = new oddthread();
		eventhread e = new eventhread();
		o.start();
		try
		{ 
			o.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		e.start();
		try
		{ 
			e.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class oddthread extends Thread
{
  public void run()
	{
		try
		{
			System.out.print("Odd Numbers  : ");
			for(int i=1;i<=100;i+=2)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		catch(Exception e) 
		{
			System.out.print(e);
		}
	}
}
class eventhread extends Thread
{
	public void run()
	{
		try{
			System.out.print("Even Numbers : ");
			for(int i=2;i<=100;i+=2)
   		{			
				System.out.print(i+" ");
			}
			System.out.println();
			}
		catch(Exception e) {System.out.print(e);}
	}
}

/*
OUTPUT
Odd Numbers  : 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 
Even Numbers : 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 

