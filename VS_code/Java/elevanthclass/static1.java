package VS_code.Java.elevanthclass;

class Student{
    int rollno;
    String name;
    static String college;
    public static void change(){
        college="KIT";
    }
   
    
}
public class static1 {
    public static void main(String[] args) {
        Student.college="Brainware";
        Student s1 = new Student();
        s1.rollno=101;
        System.out.println(s1.college);
        System.out.println(s1.rollno);
    }
}
