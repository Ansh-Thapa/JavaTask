// Write a method to determine if a number is a Duck number
import java.util.Scanner;
public class Q_no_12 {
     public static Boolean check(String n){
        if (n.charAt(0)=='0'){
            return false;
        }
        for(int i=1; i<n.length(); i++){
            if (n.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        String n=sc.nextLine();
        if(check(n)){
            System.out.println("Given number is duck number");
        }
        else{
            System.out.println("Given number is not duck number");
        }
        sc.close();        
    }
}
