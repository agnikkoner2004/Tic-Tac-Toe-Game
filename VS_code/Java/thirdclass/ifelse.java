package VS_code.Java.thirdclass;
import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        if (a==b) {
            System.out.println("a & b are equal");
            
        }else if (a<b) {
            System.out.println("a is lesser than b");
            
        }else {
            System.out.println("a is greater than b");
        }
        SC.close();
    }
    
}
