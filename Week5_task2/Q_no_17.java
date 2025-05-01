// Create a method to reverse an integer number without converting it to a string

import java.util.Scanner;

public class Q_no_17 {
    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num =num/ 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Reversed number: " + reverse(number));
        sc.close();
    }
}
