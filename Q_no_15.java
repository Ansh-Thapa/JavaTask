// Input a number and display the factorial of that number using a for loop.
package Week3_task1;
import java.util.Scanner;
public class Q_no_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = sc.nextInt();
        sc.close();
        int fact=1;
        System.out.println("Factorial of " + num + " is: ");
        for (int i=1; i<=num; i++){
            fact = fact * i;
            System.out.println(fact);
        }   
    }
}
