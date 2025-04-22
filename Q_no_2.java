//Take two numbers as input and print their sum, difference, product, and quotient.
package Week3_task1;
import java.util.Scanner;
public class Q_no_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a=sc.nextInt();
        System.out.print("Enter your second number: ");
        int b=sc.nextInt();
        sc.close();
        int sum= a+b;
        int difference= a-b;
        int product= a*b;
        int quotient= a/b;
        System.out.println(sum+ " is the sum of two numbers.");
        System.out.println(difference+" is the difference of the two numbers.");
        System.out.println(product+" is the product of the two numbers.");
        System.out.println(quotient+" is the quotient of the two numbers.");
    }
}
