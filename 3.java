import java.util.Scanner;
class Student{
    String S_Name;
    String S_Rollno;
    int Maths_mark;
    int Eng_mark;
    int Tamil_mark;
    void read_data(String S_Name,String S_Rollno,int Maths_mark,int Eng_mark,int Tamil_mark){
        this.S_Name=S_Name;
        this.S_Rollno=S_Rollno;
        this.Maths_mark=Maths_mark;
        this.Eng_mark=Eng_mark;
        this.Tamil_mark=Tamil_mark;
    }
}
class Biology extends Student{
    int Bio_Mark;
    int Total_Mak;
    int Avg_Mark;
    void read_data(String S_Name,String S_Rollno,int Maths_mark,int Eng_mark,int Tamil_mark,int Bio_Mark){
        this.S_Name=S_Name;
        this.S_Rollno=S_Rollno;
        this.Maths_mark=Maths_mark;
        this.Eng_mark=Eng_mark;
        this.Tamil_mark=Tamil_mark;
        this.Bio_Mark=Bio_Mark;
    }
    void calc_mark(){
        Total_Mak=Maths_mark+Eng_mark+Tamil_mark+Bio_Mark;
        Avg_Mark=Total_Mak/4;
    }
    void disp(){
        System.out.println("Name "+S_Name);
        System.out.println("Roll number: "+S_Rollno);
        System.out.println("Biology");
        System.out.println("total marks"+ Total_Mak);
        System.out.println("Avg marks "+Avg_Mark);
        System.out.println("-----------------------------");
    }
}
/*Computer Classs
Data Members:
Computer_Mark,Tot
al_Makr, Avg_Mark
Member Function
void read_data()
void calc_mark()
void disp()*/
class Computer extends Student{
    int Computer_Mark;
    int Total_Mak;
    int Avg_Mark;
    void read_data(String S_Name,String S_Rollno,int Maths_mark,int Eng_mark,int Tamil_mark,int Computer_Mark){
        this.S_Name=S_Name;
        this.S_Rollno=S_Rollno;
        this.Maths_mark=Maths_mark;
        this.Eng_mark=Eng_mark;
        this.Tamil_mark=Tamil_mark;
        this.Computer_Mark=Computer_Mark;
    }
    void calc_mark(){
        Total_Mak=Maths_mark+Eng_mark+Tamil_mark+Computer_Mark;
        Avg_Mark=Total_Mak/4;
    }
    void disp(){
        System.out.println("Name "+S_Name);
        System.out.println("Roll number: "+S_Rollno);
        System.out.println("Computer");
        System.out.println("total marks"+ Total_Mak);
        System.out.println("Avg marks "+Avg_Mark);
        System.out.println("-----------------------------");
    }
}
/*Arts Classs
Data Members:
Commerce_Mark,Tot
al_Makr, Avg_Mark
Member Function
void read_data()
void calc_mark()
void disp()*/
class Arts extends Student{
    int Commerce_Mark;
    int Total_Mak;
    int Avg_Mark;
    void read_data(String S_Name,String S_Rollno,int Maths_mark,int Eng_mark,int Tamil_mark,int Commerce_Mark){
        this.S_Name=S_Name;
        this.S_Rollno=S_Rollno;
        this.Maths_mark=Maths_mark;
        this.Eng_mark=Eng_mark;
        this.Tamil_mark=Tamil_mark;
        this.Commerce_Mark=Commerce_Mark;
    }
    void calc_mark(){
        Total_Mak=Maths_mark+Eng_mark+Tamil_mark+Commerce_Mark;
        Avg_Mark=Total_Mak/4;
    }
    void disp(){
        System.out.println("Name "+S_Name);
        System.out.println("Roll number: "+S_Rollno);
        System.out.println("Arts");
        System.out.println("total marks"+ Total_Mak);
        System.out.println("Avg marks "+Avg_Mark);
        System.out.println("-----------------------------");
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
        Biology b1= new Biology();
        b1.read_data(a1,a2,a3,a4,a5,a6);
        b1.calc_mark();
        b1.disp();
        Computer c1= new Computer();
        c1.read_data(a1,a2,a3,a4,a5,a7);
        c1.calc_mark();
        c1.disp();
        Arts g1= new Arts();
        g1.read_data(a1,a2,a3,a4,a5,a8);
        g1.calc_mark();
        g1.disp();

    }
}