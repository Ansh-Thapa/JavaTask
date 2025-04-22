// Input a month number (1–12) and print the number of days in that month using switch.
package Week3_task1;
import java.util.Scanner;
public class Q_no_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        sc.close();
        int days;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                System.out.println("There are "+days+" days in this month.");
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                System.out.println("There are "+days+" days in this month.");
                break;
            case 2: // February
                days = 28;
                System.out.println("There are "+days+" days in this month.");
                break;
            default:
                System.out.println("Invalid month number.");
        }
    }
}
