// Take a number n and print the sum of first n natural numbers using a loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        System.out.println("Sum of the first " + n + " natural number is: ");
        for (int i=1; i<=n; i++){
            sum += i;
            System.out.println(sum);
        }
    }
}
