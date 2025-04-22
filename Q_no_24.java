// Input n and print the first n terms of the Fibonacci series. 
package Week3_task1;
import java.util.Scanner;
public class Q_no_24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1, c;
        System.out.println("Fibonacci series: ");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("The " + n + "th term of the Fibonacci series is: " + b);
    }
}
