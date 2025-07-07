// package SixthClass;
// import java.util.*;
// public class Array {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size=sc.nextInt();
//         int numbers[]=new int[size];
//         //int i=0;
//         for( int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }
//         System.out.println(numbers[0]);
//         sc.close();
//     }
    
// }

// package SixthClass;
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[1,2,3,2,4,2,3,5,4,3];
//         //for(int i=0;i<number.length;i++){
//         //    number[i]=sc.nextInt();
//         //}
//         int x=sc.nextInt();
//         for(int i=0;i<number.length;i++){
//             if (x==number[i]){
//                 System.out.println("number found in index no:" + i);
//             }

//         }
//     sc.close();
//     }
// }
package VS_code.Java.SixthClass;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 3, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a number to find its occurrence: ");
        int find = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i== find) {
                count++;
            }
        }
        sc.close();
        System.out.println("The number " + find + " occurs " + count + " times in the array.");
    }
}

