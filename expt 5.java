1.
import java.util.*;
import java.io.*;
class file
{
	    public static void main(String args[])throws IOException
	    	{
	    	      	int j=1;
	    	     	char ch;
	    	     	int nw=0;
	    	     	Scanner sc=new Scanner (System.in);
	    	     	System.out.println("Enter the document name");
	    	     	String str=sc.next();
	    	     	FileInputStream r=new FileInputStream(str);
	    	     	System.out.println("Contents of file are:");
	    	     	int n=r.available();
	    	     	System.out.println(j+" ");
	    	     	for(int i=0;i<n;i++)
	    	   	   {
	    	      		  ch=(char)r.read();
	    	      		  System.out.println(ch);
	    	      		  if (ch== '\n')
	    	      		 
	    	      		   {
	    	        		  System.out.println(" "+j);
	    	        		  j++;
	    	       		   }
	    	           }
	    	  }
	 
}
	
  output 
  Enter the document name
file.txt
Contents of file are:
1 rija
2.nimmi 

3.
import java.io.*;
import java.util.*;
class file3
{
 public static void main(String args[])
 {
  try
  {
   FileWriter fw=new FileWriter("/home/s3d1/s3d28/file3.txt");
   FileReader fr=new FileReader("/home/s3d1/s3d28/file3.txt");      
   fw.write("Name:Irene Ann Jacob\n");
   fw.write("Address :asssdd");
   fw.close();
   int i;
   while((i=fr.read())!=-1)
   {
    System.out.print((char)i); 
   }
   fr.close();
  }
  catch(Exception e)
  {System.out.println("Exception occured");}
 }
}
2.
import java.io.*;
class Main
{
 public static void main(String args[])
 {
  try
  {
   FileReader f1=new FileReader("test1.txt");
   BufferedReader b=new BufferedReader (f1);
   int l=0,w=0,c=0;
   String s=y.readLine();
   while(s!=null)
   {
    l++;
    String[] word=s.split(" ");
    w=w+word.length;
    for(String i:word)
    {
     c=c+i.length();
    }
    s=y.readLine();
   }
   System.out.println("Number of lines:"+l);
   System.out.println("Number of words :"+w); 
   System.out.println("Number of characters :"+c);
  }
  catch(Exception e)
  {System.out.println("Exception occured");}
 }
}



/*
Output:
Number of lines:
Number of words :10
Number of characters :47
*/
