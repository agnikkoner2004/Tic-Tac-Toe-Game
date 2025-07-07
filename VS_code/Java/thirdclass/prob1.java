package VS_code.Java.thirdclass;

import java.util.*;
public class prob1 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int button = SC.nextInt();

        switch (button) {
            case 1:System.out.println("january");
                
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4:System.out.println("April");      
                break;
            case 5:System.out.println("May");
                break;
            case 6:System.out.println("june");
             
                break;
            case 7: System.out.println("July");
                break;
            case 8:System.out.println("August");              
            default:System.out.println("invalid");
                break;
        }
        SC.close();
    }
    
}
