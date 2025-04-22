package Week3_task1;
//Write a program to check whether a given number is positive, negative, or zero using if-else.
import java.util.Scanner;
public class Q_no_3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int a=sc.nextInt();
        sc.close();
        if(a>0){
            System.out.println("The given number is positive.");
        }
        else if(a<0){
            System.out.println("The given number is negative.");
        }
        else{
            System.out.println("The given number is zero");
        }
    }
}
