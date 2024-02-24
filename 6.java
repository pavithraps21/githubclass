class student{
    student(String name){
        System.out.println(name);
    }
    student(String name,int a){
        System.out.println(name +" " + a);
    }
    student(long id){
        System.out.println(id);
    }
}
class demo{
    public static void main(String[] args){
        student o =new student("hareea");
        student o1 =new student("hareea",45);
        student o2 =new student(654654);

    }
}