package VS_code.Java.tenthclass;
 
class encapsulaton {
    abstract class Animal {
        abstract void walk();
    }
    class Horse extends Animal{
        public void walk(){
            System.out.println("Walks with 4 legs ");
             
        }
        
    }
    class Chicken extends Animal{
        public void walk(){
            System.out.println("Walks with 2 legs hii ");
             
        }
    
    
        
    }
    public static void main(String[] args) {
        
        Horse horse= new Horse ();
        horse.walk();
        Animal animal=new Animal();
        animal.walk();
    }
    
}
