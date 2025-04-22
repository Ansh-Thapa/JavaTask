// Write a program to input a character and check if it is a vowel or a consonant using if-else.
package Week3_task1;
import java.util.Scanner;
public class Q_no_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter any alphabet you want: ");
        char alpha=sc.next().charAt(0);
        sc.close();
        if (alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u'){
            System.out.println(alpha+ " is a vowel.");
        }
        else{
            System.out.println(alpha+ " is a consonant.");
        }
    }
}
