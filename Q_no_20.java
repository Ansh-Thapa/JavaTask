//Input a number and check if it is a perfect square using for loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPerfectSquare = false;
        for (int i = 0; i <= Math.sqrt(num); i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
