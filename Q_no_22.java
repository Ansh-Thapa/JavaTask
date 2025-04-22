// Input a number and reverse it using a for loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = sc.nextInt();
        sc.close();
        int reverse = 0;
        for (int i = num; i > 0; i /= 10) {
            reverse = reverse * 10 + i % 10;
            System.out.println(reverse);
        }
    }
}
