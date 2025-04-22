// Write a program to count how many digits are in a given number using a loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        System.out.println("Number of digits in " + num + " is: ");
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
