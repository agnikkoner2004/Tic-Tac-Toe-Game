package VS_code.Java.tenthclass;
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(String name, int age){
    //     this.name= name;
    //     this.age = age;
        
    //}
    Student(){

    }
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age){
        System.out.println(name+" "+ age);
    }
}
public class oops1 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Agnik";
        s1.age=24;
        
        s1.printinfo(s1.name,s1.age);
    }
    
}
