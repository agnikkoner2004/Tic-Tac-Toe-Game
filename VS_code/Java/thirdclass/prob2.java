package VS_code.Java.thirdclass;

import java.util.Scanner;

public class prob2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println(a + " % " + b + " = " + (a % b));
                } else {
                    System.out.println("Error! Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
        }

        scanner.close();
     }
}
