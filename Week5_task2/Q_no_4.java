//Write a method to count the number of words in a given string.
import java.util.Scanner;

public class Q_no_4 {
    public static void givenstring(String n){
        int count=0;
        for (int i=0; i<n.length(); i++){
            if(Character.isDigit(n.charAt(i))){
                count++;
            }
        }
        System.out.println("Given string has "+count+" digits");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string: ");
        String n=sc.nextLine();
        givenstring(n);
        sc.close();
    }
}
