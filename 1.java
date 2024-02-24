import java.util.Scanner;
class P_Date{
    String doa;
    String dod;
    P_Date(String doa,String dod){
        this.doa=doa;
        this.dod=dod;
    }
    void disp(){
        System.out.println("Date of admission: "+doa);
        System.out.println("Date of discharge: "+dod);
    }
}
class Patient extends P_Date{
    String name;
    String d_name;
    int age;
    Patient(String doa,String dod,int age,String name,String d_name){
        super(doa,dod);
        this.name=name;
        this.age=age;
        this.d_name=d_name;
        
    }
    void disp(){
        super.disp();
        System.out.println("Name : "+name);
        System.out.println("Disease name: "+d_name);
        System.out.println("Age : "+age);

    }
    void check(){
        if(age<12){
            System.out.println("pediatric patents");
        }
    }
}
class demo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a1=sc.next();
        String a2=sc.next();
        int a3=sc.nextInt();
        String a4=sc.next();
        String a5=sc.next();
        System.out.println("-----------------------------");
        Patient ob1=new Patient(a1,a2,a3,a4,a5);
        ob1.check();
        ob1.disp();
        
        
    }
}