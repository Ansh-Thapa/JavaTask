//Create a method to convert a given number of days into years, months, and days.
import java.util.Scanner;
public class Q_no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days you want: ");
        int days = sc.nextInt();
        yearsdays(days);
        sc.close();
    }
    public static void yearsdays(int days){
        int years = days/365;
        days=days%365;
        int months = days/30;
        System.out.println(years+ " years "+ months+ " months "+ days+ " days ");
    }
}
