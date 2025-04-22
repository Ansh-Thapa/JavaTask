// Input the age of a person and check if they are eligible to vote (18 or older).
package Week3_task1;
import java.util.Scanner;
public class Q_no_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your age to know the eligibility to vote: ");
        int age=sc.nextInt();
        sc.close();
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
}
