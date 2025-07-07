package VS_code.Java.elevanthclass;
interface Animal {
    int eyes = 2;
    void travel();
}
interface herbivorous {
    void eat();
}
class Horse implements Animal, herbivorous {
    public void travel() {
        System.out.println("Horse is a domestic animal");
    }
    public void eat() {
        System.out.println("Horse eats grass");
    }
}    

public class interface1 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.travel();
        h.eat();
    }
}






    
