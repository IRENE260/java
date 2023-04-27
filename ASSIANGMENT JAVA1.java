import java.util.*;
class student
{
    public static void main(String args[])
    {
        int rollno,phone,age,cgpa;
        char name;
        void read(student s)
        {
            Scanner in=new Scanner (System.in);
            System.out.println("name");
            this.name=in.nextLine();
            System.out.println("Roll no");
            this.rollno=in.nextInt();
            
            System.out.prinln("age");
            this.age=in.nextInt();
            System.out.prinln("Phone no");
            this.phoneno=in.nextLong;
            System.out.println("cgpa");
            this.cgpa=in.nextFloat();
            System.out.prinln("               ");
            
            
            
        }
        student()
        {
            read(this);
        }
    }
    public class main
    {
        public static void main(String args[])
        {
            int l=0,i,n=0,a=0,o=50;
            float r=0;
            student[] s=new student[10];
            for(i=0;i<10;i++)
            {
                s[i]=new student();
                
            }
            for(i=0;i<10;i++)
            {
                if s[i].cgpa>r
                {
                    r=s[i].cgpa;
                    l=i;
                }
                if ((s[i].name.compareTo("ANU"))==0
                {
                    n=i
                }
                if (s[i].age<o)
                {
                    o=s[i].age;
                    a=i;
                }
            }
            System.out.println("Student with highest cgpa"+s[l].name);
            System.out.println("phone number of anu"+s[n].phone no);
            System.out.println("Roll no of youngest "+s[a].rollno);
            

        }
        
    }
OUTPUT;
NAME:BINDU
Rollno:22
Age:19
Phone number:
345678
CGPA:7.68
NAME:CIA
Rollno:23
Age:20
Phone number:31234333
CGPA:8.9
NAME:ASHWIN
Age:16
Phone number:88383838383
CGPA:9.4
NAME:DANI
Rollno:$%
Age:20
Phone number:909090909090
CGPA:9.5
NAME:PRIYA
Age:21
Phone number:8986766788
CGPA:6.7
NAME:ANU
Age:20
Phone number:6767676767
CGPA:6.7
NAME:ANI
Age: 25
Phone number:29292929
CGPA:8.7
student with highest cgpa:PRIYA
phone number of anu:6767676767
roll no of youngest :88383838383
