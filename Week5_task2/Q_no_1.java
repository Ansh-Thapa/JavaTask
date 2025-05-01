// Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;
public class Q_no_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int n = sc.nextInt();
        sc.close();
        odd(n, n);
    }
    public static void odd(int n, int num){
        System.out.println("The odd numbers are: ");
        for (int i=1; i<=n; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}