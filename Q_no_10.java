//Write a program to take a number from the user and print whether it is a leap year or not.
package Week3_task1;
import java.util.Scanner;
public class Q_no_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year you want: ");
        int year = sc.nextInt();
        sc.close();
        if ((year%4==0 && year%100!=0)|| (year%400==0)){
            System.out.println(year+" is a leap year.");
            }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
