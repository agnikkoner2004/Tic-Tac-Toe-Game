// package FifthClass;
// import java.util.*;
// public class Functions {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return ;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name= sc.next();
//         System.out.println(name);
//         sc.close();
//     }
// }
 
package VS_code.Java.FifthClass;
import java.util.*;

public class Functions {

    public static int CalculateSum(int a , int b){
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=CalculateSum(a,b);
        System.out.println("Sum of two numbers"+sum);

        sc.close();
    }
}