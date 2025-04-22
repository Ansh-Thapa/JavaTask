//Input a number from the user and display whether it is a prime number using a for loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int prime = sc.nextInt();
        boolean isPrime = true;
        sc.close();
        if (prime <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(prime + " is a prime number.");
        } else {
            System.out.println(prime + " is not a prime number.");
        }
        
    }
}
