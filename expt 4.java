 2.
 import java.util.*;
abstract class abc{
    abstract void number ();
    
}
class rectangle extends abc
{
    void number(){
        System.out.println("Rectangle :side 4 ");
    }
}
class triangle extends abc
{
    void number()
    {
        System.out.println("Triangle:sides 3")
    }
}
class hexagon extends abc{
    void number()
    {
        System.out.println("Hexagon:sides 6")
    }
}
public class Main
{
	public static void main(String[] args) {
		rectangle r=new rectangle();
		trinagle t=new triangle();
		hexagon h=new hexagon();
		r.number();
		t.number();
		h.number();
	}
	4.
import java.util.*;
class employee
{
    void display()
    {
        System.out.println("class :employee)";
    }
    void salary()
    {
        System.out.println("Salary of employee is 10000");
        
    }
}
class engineer extends employee
{
    void display()
    {
        super.display();
        super.salary();
        System.out.println("Salary is 20000")
    }
}
public class Main
{
	public static void main(String[] args) {
		engineer obj=new engineer();
		obj.display();
		obj.salary();
		
	}
}

}
