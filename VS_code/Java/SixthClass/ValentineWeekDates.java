package VS_code.Java.SixthClass;
import java.util.Scanner;
public class ValentineWeekDates {
    public static void main(String[] args) {
        String[] days = {
            "7th February - Rose Day",
            "8th February - Propose Day",
            "9th February - Chocolate Day",
            "10th February - Teddy Day",
            "11th February - Promise Day",
            "12th February - Hug Day",
            "13th February - Kiss Day",
            "14th February - Valentine's Day"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a day (7 to 14): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number between 7 and 14.");
            scanner.next();
        }
        int chosenDay = scanner.nextInt();
        if (chosenDay >= 7 && chosenDay <= 14) {
            System.out.println("Hay madam!! wishing you happy " + days[chosenDay - 7]);
        } else {
            System.out.println("Invalid choice! Please choose a day between 7 and 14.");
        }
        scanner.close();
    }
}
