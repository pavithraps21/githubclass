/*Consider an example of declaring the examination result. Design three classes: Student, Exam and Result. The
Student class has data members such as those representing roll number, name, etc. Create the class Exam by
inheriting Student class. The Exam class adds fields representing the marks scored in six subjects. Derive the
Result form the Exam class, and it has its own fields such as total_marks. Write an interactive program to model
this relationship.*/
import java.util.Scanner;
class Student{
    String name;
    String r_num;
    int age;
    Student(String name,String r_num,int age){
        this.name=name;
        this.r_num=r_num;
        this.age=age;
    }
    void disp(){
        System.out.println("Name :"+name);
        System.out.println("Roll number :"+r_num);
        System.out.println("Age :"+age);
    }
}
class Exam extends Student{
    int m1,m2,m3,m4,m5,m6;
    Exam(String name,String r_num,int age,int m1,int m2,int m3,int m4,int m5,int m6){
        super(name,r_num,age);
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
        this.m6=m6;
    }
    void disp(){
        super.disp();
        System.out.println("sub 1: "+m1);
        System.out.println("sub 2: "+m2);
        System.out.println("sub 3: "+m3);
        System.out.println("sub 4: "+m4);
        System.out.println("sub 5: "+m5);
        System.out.println("sub 6: "+m6);
    }
}
class Result extends Exam{
    int total;
    float avg;
    Result(String name,String r_num,int age,int m1,int m2,int m3,int m4,int m5,int m6){
        super(name,r_num,age,m1,m2,m3,m4,m5,m6);
    }
    void disp(){
        super.disp();
        total=m1+m2+m3+m4+m5+m6;
        avg=(m1+m2+m3+m4+m5+m6)/6;
        System.out.println("Total marks: "+total);
        System.out.println("Average marks: "+avg);
    }
}
class demo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a1=sc.next();
        String a2=sc.next();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        int a5=sc.nextInt();
        int a6=sc.nextInt();
        int a7=sc.nextInt();
        int a8=sc.nextInt();
        int a9=sc.nextInt();
        Result ob1 = new Result(a1,a2,a3,a4,a5,a6,a7,a8,a9);
        ob1.disp();
    }
}