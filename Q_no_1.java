// Write a Java program to input your full name and print a greeting message.
package Week3_task1;
import java.util.Scanner;
public class Q_no_1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String full_name=sc.nextLine();
        sc.close();
        System.out.println(full_name+ ", Welcome to Softwarica.");
    }
}

