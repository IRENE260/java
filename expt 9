1.
package com.company;
import java.sql.*;
import java.util.*;
public class cgpa 
{
    public static void main(String[] args) 
    {
	try 
	{
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false", "root", "ashu");
            Statement stmt = con.createStatement();
            System.out.print("Enter How Many Student : ");
            int n = sc.nextInt();
            int rollno;
            String name;
            float CGPA;
            PreparedStatement ps = con.prepareStatement("insert into studentCGPA values(?,?,?)");
            for(int i = 0; i < n; i++) 
	    {
                System.out.println("\n\tDetails of Student "+(i+1));
                System.out.print("\nEnter Roll No: ");
                rollno = sc.nextInt();
                System.out.print("Enter Name: ");
                name = sc.next();
                System.out.print("Enter CGPA: ");
                CGPA = sc.nextFloat();
                ps.setInt(1, rollno);
                ps.setString(2, name);
                ps.setFloat(3, CGPA);
                ps.executeUpdate();
            }
            ResultSet rs = stmt.executeQuery("select * from studentCGPA where CGPA > 7;");
            System.out.println("\n \t Students who have CGPA greater than 7 ");
            while (rs.next())
                System.out.println("Roll no : "+rs.getInt(1) + " \t Name : " + rs.getString(2) + "\t CGPA : " + rs.getFloat(3));
            System.out.println("Click 1 to clear the table or else click 0 to continue ");
            int ch = sc.nextInt();
            if(ch == 1)
                stmt.executeUpdate("truncate studentCGPA");

        } 
	catch (Exception e) 
	{
            System.out.println(e);
        }
    }
} 
2.
package com.company;
import java.sql.*;
class displayrecord
{
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false","root","jsap");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from studentdetails");
            System.out.println("No \t Name \t Age \t Place" );
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getString(4));

        }
        catch(Exception e){
            System.out.println(e);}
    }
}
