//Take a number from the user and print whether it is even or odd.
package Week3_task1;
import java.util.Scanner;
public class Q_no_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int a = sc.nextInt();
        sc.close();
        if (a%2==0){
            System.out.println(a+" is an even number.");
        }
        else{
            System.out.println(a+ " is an odd number.");
        }
    }
}
