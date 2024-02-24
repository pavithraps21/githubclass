import java.util.Scanner;
class demo
{
 public static void main(String args[])
 {
  result r=new result(89);
  r.display();
 }
}
interface sports
{ 
 int grace=15;
 int max=100;
}
class student
{
 int rno;
 int ex_mark;
}
class exam extends student
{
 exam(int m1)
 {
  ex_mark=m1;
 }
}
class result extends exam implements sports
{
result(int n1)
{
 super(n1);
}
 int total=ex_mark+grace;
void display()
{
 System.out.println("you're total is :"+ total);
 if(total>max)
 {
  System.out.println("total is greater than maximum marks");
  System.out.println("hence mark is :"+max);
 }
}
}
