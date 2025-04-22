package Week3_task1;
//Write a program that takes a number and checks if it is divisible by both 5 and 11.
import java.util.Scanner;
public class Q_no_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int a = sc.nextInt();
        sc.close();
        if (a%5==0){
            if (a%11==0){
                System.out.println(a+" is divisible by both 5 and 11");
            }
            else{
                System.out.println(a+" is divisible by 5.");
            }
        }
        else if(a%11==0){
            System.out.println(a+" is divisible by 11");
        }
        else{
            System.out.println(a+" is not divisible by both the numbers.");
        }
        }
    }
