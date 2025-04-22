//Take marks of five subjects and calculate the total, percentage, and grade using if-else.
package Week3_task1;
import java.util.Scanner;
public class Q_no_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the marks of the first subject: ");
        int a=sc.nextInt();
        System.out.print("Enter the marks of the second subject: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of the third subject: ");
        int c= sc.nextInt();
        System.out.print("Enter the marks of the fourth subject: ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of the fifth subject: ");
        int e = sc.nextInt();
        sc.close();
        int total = a+b+c+d+e;
        System.out.println(total+" is the total marks obtained.");
        double percentage=(total/500.0)*100;
        System.out.println(percentage+ " is the percentage obtained.");
        sc.close();
        if (percentage<=100 && percentage>90){
        System.out.println("Your grade is A");
        }
        else if(90>=percentage && percentage>80){
            System.out.println("Your grade is B");
        }
        else if(80>=percentage && percentage>70){
            System.out.println("Your grade is C");
        }
        else if(70>=percentage && percentage>60){
            System.out.println("Your grade is D");
        }
        else if(60>=percentage && percentage>50){
            System.out.println("Your grade is E");
        }
        else if(50>=percentage && percentage>=40){
            System.out.println("Your grade is F");
        }
        else if(40>=percentage && percentage>=0){
            System.out.println("You have failed.");
        }
        else{
            System.out.println("Error");
        }
    }
}
