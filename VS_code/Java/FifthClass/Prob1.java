package VS_code.Java.FifthClass;
import java.util.*;
public class Prob1 {
    public static boolean IsPrime(int n){
        if (n<=1) {
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if (n%i==0) {
                    return false;
                    
                }
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if (IsPrime(n)==true) {
            System.out.println("yes it is prime");
            
        }
        else{
            System.out.println("no! it isnot a prime number");
        }
        sc.close();
    }
    
}
