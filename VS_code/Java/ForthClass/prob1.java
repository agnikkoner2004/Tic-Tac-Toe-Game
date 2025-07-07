package VS_code.Java.ForthClass;
import java.util.*;
public class prob1 {
    public static void main(String[] args) {
        Scanner SC= new Scanner (System.in);
        int n = SC.nextInt(); 
        for(int i=1; i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
                
            }
        }
        SC.close();
        }
    }
    

