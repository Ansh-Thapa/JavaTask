//Write a program to print the multiplication table of a given number using for loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
