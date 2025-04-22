// Write a program to find the sum of digits of a number using a loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        System.out.println("Sum of the digits of " + num + " is: ");
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
