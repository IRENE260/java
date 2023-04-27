1.
import java.util.*;
class employee
{
 Scanner obj = new Scanner(System.in);
 String name;
 int age;
 long phn;//phone number
 String ads;//address
 float sly;//salary
 void printSalary()
 {
  System.out.println("Salary:"+sly);
 }
 void read()
 {
  System.out.println("Enter name,address,age,phone_number,salary");
  this.name = obj.nextLine();
  this.ads = obj.nextLine();
  this.age = obj.nextInt();
  this.phn = obj.nextLong();
  this.sly = obj.nextFloat();
 }
 void print()
 {
  System.out.println("Name:"+this.name);
  System.out.println("Age:"+this.age);
  System.out.println("Ph.No.:"+this.phn);
  System.out.println("Address:"+this.ads);
  this.printSalary();
 }
}
class officer extends employee
{
 Scanner obj = new Scanner(System.in);
 String spn;//specialization
 void read()
 {
  super.read();
  System.out.println("Specialization:");
  this.spn = obj.nextLine();
 }
 void print()
 {
  super.print();
  System.out.println("Specialization:"+this.spn);
 }
}
class manager extends employee
{ 
 Scanner obj = new Scanner(System.in);
 String dep;//department
 void read()
 {
  super.read();
  System.out.println("Department:");
  this.dep = obj.nextLine();
 }
 void print()
 { 
  super.print();
  System.out.println("Department:"+this.dep);
 }
}
class office
{
 public static void main(String args[])
 {
  officer o = new officer();
  manager m = new manager();
  o.read();
  
  m.read();
  System.out.println("\n\n");
  o.print();
 
  m.print();
 }
 
}

Output:
Enter name,address,age,phone_number,salary
Aliya
Aliya villa
23
8547674690
35600
Specialization:
Web Development

Enter name,address,age,phone_number,salary
sharon
don villa
55
8756453200
36800
Department:
operations

3.
import java.util.*;
import java.lang.*;
public class garbageexp
{
 
 public static void main(String args[])
 {
  garbageexp ob1 = new garbageexp();
  garbageexp ob2 = new garbageexp();
  garbageexp ob3 = new garbageexp();
  ob1=ob2;
  ob3=null;
  System.gc();
 }

 public void finalize()
 {
  System.out.println("Garbage collected....");
 }
}


4.
import java.util.*;
class employee
{
 void display() 
 {
  System.out.println("Name of class is Employee.");
 }
 void calcSalary()
 {
  System.out.println("Salary of employee is 1000");
 }
}
class engineer extends employee
{
 void display() 
 {
  super.display();
  super.calcSalary();
  System.out.println("Name of class is Engineer.");
 }
 void calcSalary()
 {
  System.out.println("Salary of employee is 20000");
 }
}
class salary
{
 public static void main(String args[])
 {
  engineer eg = new engineer();
  eg.display();
  eg.calcSalary();
 }
}




Output:
Name of class is Employee.
Salary of employee is 10000
Name of class is Engineer.
Salary of employee is 20000
2.
import java.util.*;
abstract class shape
{
 abstract void numberOfSides();
}
class rectangle extends shape
{
 void numberOfSides()
 {
  System.out.println("Rectangle:\nNo.of sides: 4");
 }
}
class triangle extends shape
{
 void numberOfSides()
 {
  System.out.println("Triangle:\nNo.of sides: 3");
 }
}
class hexagon extends shape
{
 void numberOfSides()
 {
  System.out.println("Hexagon:\nNo.of sides: 6");
 }
}
class shapes
{
 public static void main(String args[])
 {
  rectangle r = new rectangle();
  triangle t = new triangle();
  hexagon h = new hexagon();
  r.numberOfSides();
  t.numberOfSides();
  h.numberOfSides();
 }
}
 Output:
 
Rectangle:
No.of sides: 4
Triangle:
No.of sides: 3
Hexagon:
No.of sides: 6
