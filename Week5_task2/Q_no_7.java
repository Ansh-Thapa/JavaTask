// Write a method to swap two numbers using a temporary variable

import java.util.Scanner;

public class Q_no_7 {
 public static void swap(int a, int b){
        System.out.println("Before swapping a: "+a+" and b: "+b);
        int temp=a;
        a=  b;
        b=temp;
        System.out.println("After swapping a: "+a+" and b: "+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a= sc.nextInt();

        System.out.println("Enter another number: ");
        int b= sc.nextInt();

        swap(a, b);
        sc.close();        
    }
}
