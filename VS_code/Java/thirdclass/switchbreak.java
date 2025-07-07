package VS_code.Java.thirdclass;
import java.util.*;
public class switchbreak {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int button = SC.nextInt();
        
        switch (button) {
            case 1:System.out.println("Hello");
                
                break;
            case 2 :System.out.println("Namaste");
                break;
            case 3 :System.out.println("Bhajunga") ;
                break;   
            default:System.out.println("Invalid");
                break;
        } 
        SC.close();
    }
    
}
